public class Championship {
    public static void main(String[] args) {

        // See Learn the Part for the complete instructions (link in resources folder of
        // Udemy video).

        int gryffindor = 400; // gryffindor points
        int ravenclaw = 200; // ravenclaw points

        // int margin = amount of points by which gryffindor scored over ravenclaw;

        if((gryffindor - ravenclaw) >= 300){
            System.out.println("They win the champoinship");
        }else if((gryffindor - ravenclaw) >= 0 ){
            System.out.println("They would come in second.");
        }else if((gryffindor - ravenclaw) >= - 100){
            System.out.println("They would come in third");
        }else{
            System.out.println("They would come in 4th");
        }

    }
}
