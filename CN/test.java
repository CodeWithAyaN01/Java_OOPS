import java.io.DataInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Random;


public class test {
    private BigInteger p;
    private BigInteger q;
    private BigInteger N;
    private BigInteger e;
    private BigInteger d;
    private BigInteger phi;
    private int bitLength = 1024;
    private Random r;

    public test() {

        r = new Random();

        p = BigInteger.probablePrime(bitLength, r);
        q = BigInteger.probablePrime(bitLength, r);
        e = BigInteger.probablePrime(bitLength/2, r);
        N = p.multiply(q);
        phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));

        while( phi.gcd(e).compareTo(BigInteger.ONE) > 0 && e.compareTo(phi) < 0) {
            e = e.add(BigInteger.ONE);
        }
        d = e.modInverse(phi);
    }

    public test(BigInteger e, BigInteger d, BigInteger N) 
    {
        this.e = e;
        this.d = d;
        this.N = N;
    }

    public static void main(String[] args) throws IOException {
        
        test rsa = new test();

        DataInputStream in = new DataInputStream(System.in);
        System.out.println("Enter the text");
        String plainText = in.readLine();

        System.out.println("The Encrypted String is -> " + plainText);
        System.out.println("The Bytes are -> " + byteToString(plainText.getBytes()));

        byte[] encrypt = rsa.encrypt(plainText.getBytes());

        byte[] decrypt = rsa.decrypt(encrypt);

        System.out.println("The Bytes are -> " + byteToString(decrypt));
        System.out.println("The Encrypted String is -> " + new String(decrypt));


    }

    public static String byteToString(byte[] encrypt) {
        String result = "";
        for(byte b : encrypt) {
            result += Byte.toString(b);
        }
        return result;
    }

    public byte[] encrypt(byte[] message) {
        return (new BigInteger(message)).modPow(e, N).toByteArray();
    }

    public byte[] decrypt(byte[] message) {
        return (new BigInteger(message)).modPow(d, N).toByteArray();
    }
}