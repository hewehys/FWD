package Readingfile;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.*;
/*
public class ProjectDataXML2CSV {
    public static void main(String[] args) {
        try
        {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            DefaultHandler handler = new DefaultHandler()
            {
                boolean id = false;
                boolean firstname = false;
                boolean lastname = false;
                boolean subject = false;
                boolean marks = false;

                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
                {
                    System.out.println("Start Element :" + qName);
                    if(qName.equalsIgnoreCase("Id"))
                    {
                        id=true;
                    }
                    if (qName.equalsIgnoreCase("FIRSTNAME"))
                    {
                        firstname = true;
                    }
                    if (qName.equalsIgnoreCase("LASTNAME"))
                    {
                        lastname = true;
                    }
                    if (qName.equalsIgnoreCase("SUBJECT"))
                    {
                        subject = true;
                    }
                    if (qName.equalsIgnoreCase("MARKS"))
                    {
                        marks = true;
                    }
                }
                //parser ends parsing the specific element inside the document
                public void endElement(String uri, String localName, String qName) throws SAXException
                {
                    System.out.println("End Element:" + qName);
                }
                //reads the text value of the currently parsed element
                public void characters(char ch[], int start, int length) throws SAXException
                {
                    if (id)
                    {
                        System.out.println("ID : " + new String(ch, start, length));
                        id = false;
                    }
                    if (firstname)
                    {
                        System.out.println("First Name: " + new String(ch, start, length));
                        firstname = false;
                    }
                    if (lastname)
                    {
                        System.out.println("Last Name: " + new String(ch, start, length));
                        lastname = false;
                    }
                    if (subject)
                    {
                        System.out.println("Subject: " + new String(ch, start, length));
                        subject = false;
                    }
                    if (marks)
                    {
                        System.out.println("Marks : " + new String(ch, start, length));
                        marks = false;
                    }
                }
            };
            saxParser.parse("F:\\XMLFile.xml", handler);
        }
        catch (Exception e)
        {
            e.printStackTrace();



        }
}}*/
