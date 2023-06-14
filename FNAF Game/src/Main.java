import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("FIVE NIGHTS AT FREDDY´S\n\nVOCÊ SE ENCONTRA PRESO DENTRO DA PIZZARIA FREDDY´S\n\nOS ANIMATRONICS TOMARAM VIDA PARA TE CAÇAR!");
        System.out.println("ESCOLHA UM DOS LOCAIS PARA SE ESCONDER\n1. COZINHA\n2. ARMARIO DO ZELADOR\n3. BANHEIRO\n4. SALA DE MANUTENÇÃO\n5. VENTILAÇÃO\n6. CAMAROTE DOS PALCOS\n7. SALA DE SEGURANÇA");

        Scanner choiceEntrance = new Scanner(System.in);
        int playerChoice = choiceEntrance.nextInt();

        //Animatronics
        Freddy attackFreedy = new Freddy();
        Chica attackChica = new Chica();
        Foxy attackFoxy = new Foxy();
        Bonnie attackBonnie = new Bonnie();

        attackFreedy.actionFreddy = Math.floor(Math.random() * 10);
        attackChica.actionChica = Math.floor(Math.random() * 10);
        attackFoxy.actionFoxy = Math.floor(Math.random() * 10);
        attackBonnie.actionBonnie = Math.floor(Math.random() * 10);

        //Salas
        Room escolhaSala = new Room();
        escolhaSala.cozinha = Math.floor(Math.random() * 10);
        escolhaSala.armario = Math.floor(Math.random() * 10);
        escolhaSala.banheiro = Math.floor(Math.random() * 10);
        escolhaSala.manutencao = Math.floor(Math.random() * 10);
        escolhaSala.ventilacao = Math.floor(Math.random() * 10);
        escolhaSala.camarote = Math.floor(Math.random() * 10);
        escolhaSala.seguranca = Math.floor(Math.random() * 10);

        if (playerChoice == 1) {
            System.out.println("VOCE SE ESCONDEU NA COZINHA");
            if (escolhaSala.cozinha != attackFreedy.actionFreddy) {
                System.out.println("Freddy não te encontrou");
            }
            if (escolhaSala.cozinha != attackChica.actionChica) {
                System.out.println("Chica não te encontrou");
            }
            if (escolhaSala.cozinha != attackFoxy.actionFoxy) {
                System.out.println("Foxy não tem encontrou");
            }
            if (escolhaSala.cozinha != attackBonnie.actionBonnie){
                System.out.println("Bonnie não te encontrou");
            }
        }
    }}

//NÃO ESTA PRONTO, PRECISA FINALIZAR!
