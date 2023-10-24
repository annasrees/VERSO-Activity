

import java.io.*;

public class even_odd_site {
    public static void main(String[] args) throws IOException {
        //creating a new buffered writer file
        BufferedWriter file = new BufferedWriter(new FileWriter("numbers.html"));
        //writing to the file a list of even and odd numbers
        file.write("<html>\n<head>\n<title>List of Numbers</title>\n</head>\n<body>\n");
        file.write("<table>\n<tr><th>Even Numbers</th><th>Odd Numbers</th></tr>\n");
        //looping through numbers
        for (int i = 1; i <= 50; i++) {
            //even nums go in first column
            if (i % 2 == 0) {
                file.write("<tr><td>" + i + "</td><td></td></tr>\n");
            }
            //odd nums go in second column
            else {
                file.write("<tr><td></td><td>" + i + "</td></tr>\n");
            }
        }
        file.write("</table>\n</body>\n</html>");
        //close the file
        file.close();
        //new reader
        BufferedReader reader = new BufferedReader(new FileReader("numbers.html"));
        String line;
        //while reader not empty
        while ((line = reader.readLine()) != null) {
            //print line
            System.out.println(line);
        }
        reader.close();
    }
}
