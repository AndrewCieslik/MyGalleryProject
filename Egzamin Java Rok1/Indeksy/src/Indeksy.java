public class Indeksy {
    private float[][] moduly;

    public Indeksy(int numerStudenta, int numerModulu) {
        this.moduly = new float[numerStudenta][numerModulu];
    }

    float obliczSrednia(int student) {
        int licznikDwoj = 0;
        float suma = 0;
        for (int i =0; i < moduly[student].length; i++) {
            if(moduly[student][i] <= 2) {
                licznikDwoj++;
            }
            suma += moduly[student][i];
        }
        if (licznikDwoj > moduly[student].length/2) {
            return 2;
        } else {
            return suma / moduly[student].length;
        }
    }

    boolean zaliczonyRok(int student) {
        return obliczSrednia(student) >= 3;
    }
    void wpiszModul(int student, int modul, float ocena) {
        this.moduly[student][modul] = ocena;
    }
    void piszDane(int student) {
            System.out.print(student +"; ");
                for(int i=0; i< moduly[student].length; i++) {
                    System.out.print(moduly[student][i] + "; " );
                }
            System.out.println(zaliczonyRok(student));
    }
}
