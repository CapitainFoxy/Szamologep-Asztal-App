public class Muveletek {

    public double szamol(String kifejezes) {
        double eredmeny = 0.0;

        try {
            if (kifejezes.contains("+")) {
                String[] szamok = kifejezes.split("\\+");
                eredmeny = Double.parseDouble(szamok[0]) + Double.parseDouble(szamok[1]);
            } else if (kifejezes.contains("-")) {
                String[] szamok = kifejezes.split("-");
                eredmeny = Double.parseDouble(szamok[0]) - Double.parseDouble(szamok[1]);
            } else if (kifejezes.contains("*")) {
                String[] szamok = kifejezes.split("\\*");
                eredmeny = Double.parseDouble(szamok[0]) * Double.parseDouble(szamok[1]);
            } else if (kifejezes.contains("/")) {
                String[] szamok = kifejezes.split("/");
                eredmeny = Double.parseDouble(szamok[0]) / Double.parseDouble(szamok[1]);
            }
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Hiba a számítás során: " + e.getMessage());
        }

        return eredmeny;
    }
}
