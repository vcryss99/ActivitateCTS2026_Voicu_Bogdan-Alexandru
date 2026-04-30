package cts.voicubogdan.g1098.decorator.main;

import cts.voicubogdan.g1098.decorator.clase.NotaDePlata;
import cts.voicubogdan.g1098.decorator.clase.NotaDePlataAbstract;
import cts.voicubogdan.g1098.decorator.clase.decorator.NotaDePlataDecorator;
import cts.voicubogdan.g1098.decorator.clase.decorator.NotaDePlataPrintat1Mai;
import cts.voicubogdan.g1098.decorator.clase.decorator.NotaDePlataPrintatNouAn;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        NotaDePlataAbstract notaDePlata = new NotaDePlata(50, "azi");
        NotaDePlataAbstract newNotaDePlata = new NotaDePlata(1000, "maine");

        notaDePlata.printeaza();
        newNotaDePlata.printeaza();

        NotaDePlataDecorator notaDePlataAnulNou = new NotaDePlataPrintatNouAn(notaDePlata);

        notaDePlata.printeaza();
        notaDePlataAnulNou.printeazaFelicitare();

        int input = 0;
        NotaDePlataDecorator notaDePlataDecoratorInput;

        if(input == 1){
            notaDePlataDecoratorInput = new NotaDePlataPrintatNouAn(notaDePlata);
        }
        else{
            notaDePlataDecoratorInput = new NotaDePlataPrintat1Mai(notaDePlata);
        }

        notaDePlataDecoratorInput.printeazaFelicitare();
    }
}
