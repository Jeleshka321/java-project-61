package hexlet.code;

public class Utilis {
        public static int generateNumber(int min, int max) {
            return (int) Math.floor(Math.random() * (max - min + 1)) + min;
        }
    }

