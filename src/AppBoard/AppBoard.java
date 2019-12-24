package AppBoard;

public class AppBoard {
    public static void main(String[] args) {
        Board application = new Board();
        System.out.println(application.getIon());
        System.out.println(application.writeMessage("Bine ati benit la acest webinar."));
        System.out.println("Feedback de la " + application.getIon().getName()+ "\n");

        System.out.println(application.getPaul());
        System.out.println(application.writeMessage("Multumim pentru aceasta oportunitate!"));
        System.out.println("Feedback de la " + application.getPaul().getName() + "\n");

        System.out.println(application.getMaria());
        System.out.println(application.writeMessage("Acest curs m-a ajutat foarte mult!"));
        System.out.println("Feedback de la " + application.getMaria().getName() + "\n");

        System.out.println(application.getMatei());
        System.out.println(application.writeMessage("Tineti-o tot asa !"));
        System.out.println("Feedback de la " + application.getMatei().getName() + "\n");

    }

}
