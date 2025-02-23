import java.io.*;

public class csvReader {
    public static void main(String[] args) {

        String path = "D:/SalesJan2009.csv";
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null){
                String[] values = line.split(",");

                // Cek panjang array untuk mencegah IndexOutOfBoundsException
                String transactionDate = values[0];
                String product = values[1];
                String price = values[2];
                String paymentType = values[3];
                String name = values[4];
                String city = values[5];
                String state = values[6];
                String country = values[7];
                String accountCreated = values[8];
                String lastLogin = values[9];
                String latitude = values[10];
                String longitude = values[11];

                // Cek apakah kolom US Zip ada dan tidak kosong
                String usZip = (values.length > 12 && !values[12].isEmpty()) ? values[12] : "N/A";

                // Cetak hasilnya
                System.out.println("Transaction date: " + transactionDate +
                        ", Product: " + product +
                        ", Price: " + price +
                        ", Payment type: " + paymentType +
                        ", Name: " + name +
                        ", City: " + city +
                        ", State: " + state +
                        ", Country: " + country +
                        ", Account Created: " + accountCreated +
                        ", Last login: " + lastLogin +
                        ", Latitude: " + latitude +
                        ", Longitude: " + longitude +
                        ", US Zip: " + usZip);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }
    }
}


