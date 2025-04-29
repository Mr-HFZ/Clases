package clase11;

public class ClaseEnum {
    enum Color{
        AMARILLI,
        VERDE,
        ROJO,
        AZUL,
        NARANJA,
        BLANCO,
        NEGRO;
    
    }

    public static void main(String[] args) {

        Color color = Color.NARANJA;
        System.out.println("El color es " + color);

        for(Color c : Color.values()){
            System.out.println(c);

        }

        System.out.println("Color " + color.name());
        System.out.println("Posicion " + color.ordinal());
        Color col = color.valueOf("VERDE");
        System.out.println("Se encuentra el color " + col);

        
    }
    
}
