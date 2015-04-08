package com.ewu3.openstudio.parsers;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.ewu3.openstudio.model.Artist;

public class ArtistXMLParser {

    public static List<Artist> parseFeed(String content) {

        try {

            boolean inDataItemTag = false;
            String currentTagName = "";
            Artist Artist = null;
            List<Artist> artistList = new ArrayList<>();

            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            XmlPullParser parser = factory.newPullParser();
            parser.setInput(new StringReader(content));

            int eventType = parser.getEventType();

            while (eventType != XmlPullParser.END_DOCUMENT) {

                switch (eventType) {
                    case XmlPullParser.START_TAG:
                        currentTagName = parser.getName();
                        if (currentTagName.equals("ROW")) {
                            inDataItemTag = true;
                            Artist = new Artist();
                            artistList.add(Artist);
                        }
                        break;

                    case XmlPullParser.END_TAG:
                        if (parser.getName().equals("ROW")) {
                            inDataItemTag = false;
                        }
                        currentTagName = "";
                        break;

                    case XmlPullParser.TEXT:
                        if (inDataItemTag && Artist != null) {
                            switch (currentTagName) {
                                case "Id":
                                    Artist.setId(Integer.parseInt(parser.getText()));
                                    break;
                                case "Img" :
                                    Artist.setImg(parser.getText());
                                case "firstName":
                                    Artist.setFirstName(parser.getText());
                                    break;
                                case "lastName":
                                    Artist.setLastName(parser.getText());
                                    break;
                                case "artistWebsite":
                                    Artist.setArtistWebsite(parser.getText());
                                    break;
                                case "artistDescription":
                                    Artist.setArtistDescription(parser.getText());
                                    break;
                                case "Address":
                                    Artist.setAddress(parser.getText());
                                    break;
                                case "Floor" :
                                    Artist.setFloor(Integer.parseInt(parser.getText()));
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;
                }

                eventType = parser.next();

            }

            return artistList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }

}
