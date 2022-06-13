public class Lit2 {

        public static void main(String[] attr) {
            Lit Dune = new Lit(001, "Roman", "War and Peace", 1867, "NoName publish house");
            Dune.setAuthor("Lev Tolstoy");
            Dune.setNumberOfPages(554);
            System.out.println(Dune);
            System.out.println(Dune.getType());
        }
    }

