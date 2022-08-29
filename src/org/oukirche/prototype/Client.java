package org.oukirche.prototype;

public class Client {

    void exp(){
        Figure figure1 = new Cercle(new Point(15,15), new Point(20,20));
        Figure figure2 = new Rectangle(new Point(30,30), new Point(40,40));

        System.out.println("la figure "+figure1+" surface: "+figure1.surface());
        System.out.println("la figure "+figure2+" surface: "+figure2.surface());

        try{
            Figure figure3 = figure1.clone();
            System.out.println("la figure "+figure3+" surface: "+figure3.surface());
            figure1.p2.setX(60);
            System.out.println("la figure "+figure1+" surface: "+figure1.surface());
            System.out.println("la figure "+figure3+" surface: "+figure3.surface());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public Client() {
        exp();
    }

    public static void main(String[] args) {
        new Client();
    }
}
