package gmibank.com.utilities;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import gmibank.com.pojos.Country;
import gmibank.com.pojos.Customer;
import gmibank.com.pojos.Customer5;
import gmibank.com.pojos.Customer6;


import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;


public class PDFGenerator {


    public static void pdfGenerator(String header, String fileName){

        Document document = new Document();
        String pdf_path = fileName;
        String pdf_title = header;
        List<String> headers = new ArrayList<String>();
        headers.add("Test");
        headers.add("SSN");
        headers.add("Country");
        headers.add("State");
        headers.add("Zip code");

        try{

            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdf_path));

            document.open(); // once dosyanin acilmasi lazim

            document.add(new Paragraph("                                                     "+pdf_title));  // sonra basligin yerlestirilmesi

            PdfPTable table = new PdfPTable(headers.size()); // headers kadar sütun açıyor

            table.setWidthPercentage(110);  // baslik ile pdf arasindaki mesafe
            table.setSpacingBefore(12);
            table.setSpacingAfter(12);
            float [] colWidth = {2,2,2,2,2};  // sutun genisligi
            table.setWidths(colWidth);

            for (int i=0; i<headers.size();i++){
                PdfPCell cellHeader = new PdfPCell(new Paragraph("  "+headers.get(i)));
                table.addCell(cellHeader);

            }



            document.add(table); // en son asamada table documentin icine atilacak

            document.close();

            writer.close();

        }

        catch(Exception e){
            e.printStackTrace();
        }


    }


    public static void pdfGeneratorRowsAndCells(String header, String fileName){

        Document document = new Document();
        String pdf_path =  fileName;
        String pdf_title = header;
   //     String logo_path = "/Users/Deneme/Desktop/logo.jpg";
        List<String> headers = new ArrayList<String>();
        headers.add("Applicants");
        headers.add("SSNs");
        headers.add("Countries");
        headers.add("States");
        headers.add("Zip codes");




        try{

            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdf_path));

            document.open();

            document.add(new Paragraph("                                     "+pdf_title));

            PdfPTable table = new PdfPTable(5);
            table.setWidthPercentage(110);
            table.setSpacingBefore(25);
            table.setSpacingAfter(25);
            float [] colWidth = {3,3,3,3,3};
            table.setWidths(colWidth);


    // headers (basliklari) tek tek ekleyelim for dongusu olmadan

            PdfPCell cell1 = new PdfPCell(new Phrase(headers.get(0)));
            table.addCell(cell1);

            PdfPCell cell2 = new PdfPCell(new Phrase(headers.get(1)));
            table.addCell(cell2);

            PdfPCell cell3 = new PdfPCell(new Phrase(headers.get(2)));
            table.addCell(cell3);


            PdfPCell cell4 = new PdfPCell(new Phrase(headers.get(3)));
            table.addCell(cell4);

            PdfPCell cell5 = new PdfPCell(new Phrase(headers.get(4)));
            table.addCell(cell5);


         //   table.setHeaderRows(2);

            List <String> rowData = new ArrayList<String>();
            rowData.add("Ibrahim");
            rowData.add("2020202202");
            rowData.add("USA");
            rowData.add("North Carolina");
            rowData.add("22180");
          //  rowData.add("final");


            table.addCell(rowData.get(0));
            table.addCell(rowData.get(1));
            table.addCell(rowData.get(2));
            table.addCell(rowData.get(3));
            table.addCell(rowData.get(4));


            table.addCell("Ahmet");
            table.addCell("4278382734");
            table.addCell("USA");
            table.addCell("Virginia");
            table.addCell("55123");

            table.addCell("Ahmet");
            table.addCell("4278382734");
            table.addCell("USA");
            table.addCell("Virginia");
            table.addCell("55123");

            table.addCell("Ahmet");
            table.addCell("4278382734");
            table.addCell("USA");
            table.addCell("Virginia");
            table.addCell("55123");

            table.addCell("Ahmet");
            table.addCell("4278382734");
            table.addCell("USA");
            table.addCell("Virginia");
            table.addCell("55123");


            document.add(table);

        //    document.add(Image.getInstance(logo_path));
            document.close();

            writer.close();

        }

        catch(Exception e){
            e.printStackTrace();
        }


    }



    public static void pdfGeneratorRowsAndCellsWithList(String header, List <Customer> list, String fileName){

        Document document = new Document();
        String pdf_path = fileName;
        String pdf_title = header;
      //  String logo_path = "/Users/mk201/OneDrive/Desktop/logo.jpg";
        List<String> headers = new ArrayList<String>();
        headers.add("Applicants");
        headers.add("SSNs");
        headers.add("Countries");
        headers.add("States");
        headers.add("Zip codes");



        try{

            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdf_path));

            document.open();

            document.add(new Paragraph("                                            "+pdf_title));

            PdfPTable table = new PdfPTable(5);
            table.setWidthPercentage(110);
            table.setSpacingBefore(25);
            table.setSpacingAfter(25);
            float [] colWidth = {2,2,2,2,2};
            table.setWidths(colWidth);



            for(int i=0;i<headers.size();i++) {

                PdfPCell cell1 = new PdfPCell(new Phrase(headers.get(i)));
                table.addCell(cell1);

            }

            table.setHeaderRows(list.size());

            for(int i=0;i<list.size();i++ ) {

                table.addCell(list.get(i).getFirstName());
                table.addCell(list.get(i).getSsn());
                table.addCell(list.get(i).getCountry().getName());
                table.addCell(list.get(i).getState());
                table.addCell(list.get(i).getZipCode());

            }
            document.add(table);

     //       document.add(Image.getInstance(logo_path));
            document.close();

            writer.close();

        }

        catch(Exception e){
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {

       //pdfGenerator("               pdf_ders","deneme.pdf");
    //  pdfGeneratorRowsAndCells("pdf2","pdf_ders2.pdf");




        List <Customer> list = new ArrayList<>();
        Country country = new Country();
        country.setName("USA");
        Customer customer = new Customer();
        customer.setFirstName("Emine");
        customer.setState("MA");
        customer.setSsn("202020202");
        customer.setZipCode("02120");
        customer.setCountry(country);

        list.add(customer);

        String header = "Information";
        String fileName ="some.pdf";

        pdfGeneratorRowsAndCellsWithList(header,list,fileName);




    }

    public static void pdfGeneratorRowsAndCellsWithListFirst5(String header, List <Customer> list, String fileName){

        Document document = new Document();
        String pdf_path = fileName;
        String pdf_title = header;

        List<String> headers = new ArrayList<String>();
        headers.add("Firstname");
        headers.add("LastName");
        headers.add("Email");
        headers.add("City");
        headers.add("SSN Number");



        try{

            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdf_path));

            document.open();

            document.add(new Paragraph("                                     "+pdf_title));

            PdfPTable table = new PdfPTable(5);
            table.setWidthPercentage(110);
            table.setSpacingBefore(25);
            table.setSpacingAfter(25);
            float [] colWidth = {2,2,2,2,2};
            table.setWidths(colWidth);



            for(int i=0;i<headers.size();i++) {

                PdfPCell cell1 = new PdfPCell(new Phrase(headers.get(i)));
                table.addCell(cell1);

            }

            table.setHeaderRows(list.size());

            for(int i=0;i<list.size();i++ ) {

                table.addCell(list.get(i).getFirstName());
                table.addCell(list.get(i).getLastName());
                table.addCell(list.get(i).getEmail());
                table.addCell(list.get(i).getCity());
                table.addCell(list.get(i).getSsn());

            }
            document.add(table);

            document.close();

            writer.close();

        }

        catch(Exception e){
            e.printStackTrace();
        }


    }


    public static void pdfGeneratorRowsAndCellsWithListFirstToTen(String header, List <Customer5> list, String fileName){

        Document document = new Document();
        String pdf_path = fileName;
        String pdf_title = header;

        List<String> headers = new ArrayList<String>();
        headers.add("Firstname");
        headers.add("LastName");
        headers.add("Middle_Initial");
        headers.add("Email");
        headers.add("MobilePhoneNumber");



        try{

            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdf_path));

            document.open();

            document.add(new Paragraph("                                     "+pdf_title));

            PdfPTable table = new PdfPTable(5);
            table.setWidthPercentage(110);
            table.setSpacingBefore(25);
            table.setSpacingAfter(25);
            float [] colWidth = {2,2,2,2,2};
            table.setWidths(colWidth);



            for(int i=0;i<headers.size();i++) {

                PdfPCell cell1 = new PdfPCell(new Phrase(headers.get(i)));
                table.addCell(cell1);

            }

            table.setHeaderRows(list.size());

            for(int i=0;i<list.size();i++ ) {

                table.addCell(list.get(i).getFirstName());
                table.addCell(list.get(i).getLastName());
                table.addCell(list.get(i).getMiddleInitial());
                table.addCell(list.get(i).getEmail());
                table.addCell(list.get(i).getMobilePhoneNumber());

            }
            document.add(table);

            document.close();

            writer.close();

        }

        catch(Exception e){
            e.printStackTrace();
        }


    }



    public static void pdfGeneratorRowsAndCellsWithList6(String header, List <Customer6> list, String fileName){

        Document document = new Document();
        String pdf_path = fileName;
        String pdf_title = header;
        //  String logo_path = "/Users/mk201/OneDrive/Desktop/logo.jpg";
        List<String> headers = new ArrayList<String>();
        headers.add("Applicants");
        headers.add("SSNs");
        headers.add("Countries");
        headers.add("States");
        headers.add("Zip codes");



        try{

            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdf_path));

            document.open();

            document.add(new Paragraph("                                            "+pdf_title));

            PdfPTable table = new PdfPTable(5);
            table.setWidthPercentage(110);
            table.setSpacingBefore(25);
            table.setSpacingAfter(25);
            float [] colWidth = {2,2,2,2,2};
            table.setWidths(colWidth);



            for(int i=0;i<headers.size();i++) {

                PdfPCell cell1 = new PdfPCell(new Phrase(headers.get(i)));
                table.addCell(cell1);

            }

            table.setHeaderRows(list.size());

            for(int i=0;i<list.size();i++ ) {

                table.addCell(list.get(i).getFirstName());
                table.addCell(list.get(i).getSsn());
                table.addCell(list.get(i).getCountry().getName());
                table.addCell(list.get(i).getState());
                table.addCell(list.get(i).getZipCode());

            }
            document.add(table);

            //       document.add(Image.getInstance(logo_path));
            document.close();

            writer.close();

        }

        catch(Exception e){
            e.printStackTrace();
        }


    }

    public static void pdfGeneratorRowsAndCellsWithListFirstToTenBank8(String header, List <Customer6> list, String fileName){

        Document document = new Document();
        String pdf_path = fileName;
        String pdf_title = header;

        List<String> headers = new ArrayList<String>();
        headers.add("Firstname");
        headers.add("LastName");
        headers.add("id");
        headers.add("Email");
        headers.add("MobilePhoneNumber");



        try{

            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdf_path));

            document.open();

            document.add(new Paragraph("                                     "+pdf_title));

            PdfPTable table = new PdfPTable(5);
            table.setWidthPercentage(110);
            table.setSpacingBefore(25);
            table.setSpacingAfter(25);
            float [] colWidth = {2,2,2,2,2};
            table.setWidths(colWidth);



            for(int i=0;i<headers.size();i++) {

                PdfPCell cell1 = new PdfPCell(new Phrase(headers.get(i)));
                table.addCell(cell1);

            }

            table.setHeaderRows(list.size());

            for(int i=0;i<list.size();i++ ) {

                table.addCell(list.get(i).getFirstName());
                table.addCell(list.get(i).getLastName());
                table.addCell(String.valueOf(list.get(i).getId()));
                table.addCell(list.get(i).getEmail());
                table.addCell(list.get(i).getMobilePhoneNumber());

            }
            document.add(table);

            document.close();

            writer.close();

        }

        catch(Exception e){
            e.printStackTrace();
        }


    }


}
