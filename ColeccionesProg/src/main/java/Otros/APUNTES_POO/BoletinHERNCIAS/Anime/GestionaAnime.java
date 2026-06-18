package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinHERNCIAS.Anime;

public class GestionaAnime {

    public static void main(String[] args) {

        // creo series

        Serie onePiece = new Serie("One Piece", 20, 1100, "Eiichiro Oda");
        Serie dragonBall = new Serie("Dragon Ball", 10, 800, "Akira Toriyama");
        Serie narutoSerie = new Serie("Naruto", 15, 700, "Masashi Kishimoto");

        Transformacion[] transfLuffy = {
                new Transformacion("Gear 2"),
                new Transformacion("Gear 3"),
                new Transformacion("Gear 4")
        };

        // hago la lista de transformaciones de cada uno (si no las creo antes, no las puedo usar)

        Transformacion[] transfGoku = {
                new Transformacion("Super Saiyan"),
                new Transformacion("Super Saiyan Blue"),
                new Transformacion("Ultra Instinct")
        };

        Transformacion[] transfNaruto = {
                new Transformacion("Modo Sabio"),
                new Transformacion("Modo Kurama")
        };

        //creo personajes

        Luffy luffy = new Luffy("Luffy", onePiece, 19, transfLuffy, "Gomu Gomu", false);
        Goku goku = new Goku("Goku", dragonBall, 40, transfGoku, true);
        Naruto naruto = new Naruto("Naruto", narutoSerie, 17, transfNaruto, Elemento.VIENTO, Aldea.KONOHA);

        // metodos

        luffy.atacar();
        luffy.reir();

        goku.volar();
        goku.teletransportarse();

        naruto.entrenar();
        naruto.crearClones();

        /* LO USO SI QUIERO QUE SOLO SE TRANSFORME A LA PRIMERA FASE
        luffy.transformar();
        goku.transformar();
        naruto.transformar(); */

        // AQUÍ LA ELIJO
        luffy.transformar(2); // Gear 4
        goku.transformar(0); // Super Saiyan
        naruto.transformar(1); // Modo Kurama

        luffy.correr();
        goku.correr();
        naruto.correr();
    }
}

