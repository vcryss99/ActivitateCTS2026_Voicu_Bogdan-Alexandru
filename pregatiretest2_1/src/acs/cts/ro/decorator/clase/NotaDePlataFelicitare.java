package acs.cts.ro.decorator.clase;

public class NotaDePlataFelicitare extends Decorator{
    public NotaDePlataFelicitare(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeaza() {
        super.printeaza();
        System.out.println("la multi ani boss");
    }
}
