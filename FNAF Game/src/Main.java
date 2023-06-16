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
        escolhaSala.cozinha = 7;
        escolhaSala.armario = 3;
        escolhaSala.banheiro = 9;
        escolhaSala.manutencao = 2;
        escolhaSala.ventilacao = 1;
        escolhaSala.camarote = 4;
        escolhaSala.seguranca = 3;


            if (playerChoice == 1 && escolhaSala.cozinha != attackFreedy.actionFreddy) {
                System.out.println("VOCÊ SE ESCONDEU NA COZINHA");
                System.out.println("Freddy não te encontrou");
            }
            if (playerChoice == 1 && escolhaSala.cozinha != attackChica.actionChica) {
                System.out.println("Chica não te encontrou");
            }
            if (playerChoice == 1 && escolhaSala.cozinha != attackFoxy.actionFoxy) {
                System.out.println("Foxy não te encontrou");
            }
            if (playerChoice == 1 && escolhaSala.cozinha != attackBonnie.actionBonnie){
                System.out.println("Bonnie não te encontrou");
            }
            //Caso te encontrem
            if (playerChoice == 1 && escolhaSala.cozinha == attackFreedy.actionFreddy) {
                System.out.println("Freddy te encontrou");
                System.out.println("FIM DE JOGO");
            }
            if (playerChoice == 1 && escolhaSala.cozinha == attackChica.actionChica) {
                System.out.println("Chica te encontrou");
                System.out.println("FIM DE JOGO");
            }
            if (playerChoice == 1 && escolhaSala.cozinha == attackFoxy.actionFoxy) {
                System.out.println("Foxy te encontrou");
                System.out.println("FIM DE JOGO");
            }
            if (playerChoice == 1 && escolhaSala.cozinha == attackBonnie.actionBonnie){
                System.out.println("Bonnie te encontrou");
                System.out.println("FIM DE JOGO");
            }

        if (playerChoice == 2 && escolhaSala.cozinha != attackFreedy.actionFreddy) {
            System.out.println("VOCÊ SE ESCONDEU NA SALA DO ZELADOR");
            System.out.println("Freddy não te encontrou");
        }
        if (playerChoice == 2 && escolhaSala.cozinha != attackChica.actionChica) {
            System.out.println("Chica não te encontrou");
        }
        if (playerChoice == 2 && escolhaSala.cozinha != attackFoxy.actionFoxy) {
            System.out.println("Foxy não te encontrou");
        }
        if (playerChoice == 2 && escolhaSala.cozinha != attackBonnie.actionBonnie){
            System.out.println("Bonnie não te encontrou");
        }
        //Caso te encontrem
        if (playerChoice == 2 && escolhaSala.cozinha == attackFreedy.actionFreddy) {
            System.out.println("Freddy te encontrou");
            System.out.println("FIM DE JOGO");
        }
        if (playerChoice == 2 && escolhaSala.cozinha == attackChica.actionChica) {
            System.out.println("Chica te encontrou");
            System.out.println("FIM DE JOGO");
        }
        if (playerChoice == 2 && escolhaSala.cozinha == attackFoxy.actionFoxy) {
            System.out.println("Foxy te encontrou");
            System.out.println("FIM DE JOGO");
        }
        if (playerChoice == 2 && escolhaSala.cozinha == attackBonnie.actionBonnie){
            System.out.println("Bonnie te encontrou");
            System.out.println("FIM DE JOGO");
        }

        if (playerChoice == 3 && escolhaSala.cozinha != attackFreedy.actionFreddy) {
            System.out.println("VOCÊ SE ESCONDEU NO BANHEIRO");
            System.out.println("Freddy não te encontrou");
        }
        if (playerChoice == 3 && escolhaSala.cozinha != attackChica.actionChica) {
            System.out.println("Chica não te encontrou");
        }
        if (playerChoice == 3 && escolhaSala.cozinha != attackFoxy.actionFoxy) {
            System.out.println("Foxy não te encontrou");
        }
        if (playerChoice == 3 && escolhaSala.cozinha != attackBonnie.actionBonnie){
            System.out.println("Bonnie não te encontrou");
        }
        //Caso te encontrem
        if (playerChoice == 3 && escolhaSala.cozinha == attackFreedy.actionFreddy) {
            System.out.println("Freddy te encontrou");
            System.out.println("FIM DE JOGO");
        }
        if (playerChoice == 3 && escolhaSala.cozinha == attackChica.actionChica) {
            System.out.println("Chica te encontrou");
            System.out.println("FIM DE JOGO");
        }
        if (playerChoice == 3 && escolhaSala.cozinha == attackFoxy.actionFoxy) {
            System.out.println("Foxy te encontrou");
            System.out.println("FIM DE JOGO");
        }
        if (playerChoice == 3 && escolhaSala.cozinha == attackBonnie.actionBonnie){
            System.out.println("Bonnie te encontrou");
            System.out.println("FIM DE JOGO");
        }

        if (playerChoice == 4 && escolhaSala.cozinha != attackFreedy.actionFreddy) {
            System.out.println("VOCÊ SE ESCONDEU NA SALA DE MANUTENÇÃO");
            System.out.println("Freddy não te encontrou");
        }
        if (playerChoice == 4 && escolhaSala.cozinha != attackChica.actionChica) {
            System.out.println("Chica não te encontrou");
        }
        if (playerChoice == 4 && escolhaSala.cozinha != attackFoxy.actionFoxy) {
            System.out.println("Foxy não te encontrou");
        }
        if (playerChoice == 4 && escolhaSala.cozinha != attackBonnie.actionBonnie){
            System.out.println("Bonnie não te encontrou");
        }
        //Caso te encontrem
        if (playerChoice == 4 && escolhaSala.cozinha == attackFreedy.actionFreddy) {
            System.out.println("Freddy te encontrou");
            System.out.println("FIM DE JOGO");
        }
        if (playerChoice == 4 && escolhaSala.cozinha == attackChica.actionChica) {
            System.out.println("Chica te encontrou");
            System.out.println("FIM DE JOGO");
        }
        if (playerChoice == 4 && escolhaSala.cozinha == attackFoxy.actionFoxy) {
            System.out.println("Foxy te encontrou");
            System.out.println("FIM DE JOGO");
        }
        if (playerChoice == 4 && escolhaSala.cozinha == attackBonnie.actionBonnie){
            System.out.println("Bonnie te encontrou");
            System.out.println("FIM DE JOGO");
        }

        if (playerChoice == 5 && escolhaSala.cozinha != attackFreedy.actionFreddy) {
            System.out.println("VOCÊ SE ESCONDEU NA VENTILAÇÃO");
            System.out.println("Freddy não te encontrou");
        }
        if (playerChoice == 5 && escolhaSala.cozinha != attackChica.actionChica) {
            System.out.println("Chica não te encontrou");
        }
        if (playerChoice == 5 && escolhaSala.cozinha != attackFoxy.actionFoxy) {
            System.out.println("Foxy não te encontrou");
        }
        if (playerChoice == 5 && escolhaSala.cozinha != attackBonnie.actionBonnie){
            System.out.println("Bonnie não te encontrou");
        }
        //Caso te encontrem
        if (playerChoice == 5 && escolhaSala.cozinha == attackFreedy.actionFreddy) {
            System.out.println("Freddy te encontrou");
            System.out.println("FIM DE JOGO");
        }
        if (playerChoice == 5 && escolhaSala.cozinha == attackChica.actionChica) {
            System.out.println("Chica te encontrou");
            System.out.println("FIM DE JOGO");
        }
        if (playerChoice == 5 && escolhaSala.cozinha == attackFoxy.actionFoxy) {
            System.out.println("Foxy te encontrou");
            System.out.println("FIM DE JOGO");
        }
        if (playerChoice == 5 && escolhaSala.cozinha == attackBonnie.actionBonnie){
            System.out.println("Bonnie te encontrou");
            System.out.println("FIM DE JOGO");
        }

        if (playerChoice == 6 && escolhaSala.cozinha != attackFreedy.actionFreddy) {
            System.out.println("VOCÊ SE ESCONDEU NO CAMAROTE");
            System.out.println("Freddy não te encontrou");
        }
        if (playerChoice == 6 && escolhaSala.cozinha != attackChica.actionChica) {
            System.out.println("Chica não te encontrou");
        }
        if (playerChoice == 6 && escolhaSala.cozinha != attackFoxy.actionFoxy) {
            System.out.println("Foxy não te encontrou");
        }
        if (playerChoice == 6 && escolhaSala.cozinha != attackBonnie.actionBonnie){
            System.out.println("Bonnie não te encontrou");
        }
        //Caso te encontrem
        if (playerChoice == 6 && escolhaSala.cozinha == attackFreedy.actionFreddy) {
            System.out.println("Freddy te encontrou");
            System.out.println("FIM DE JOGO");
        }
        if (playerChoice == 6 && escolhaSala.cozinha == attackChica.actionChica) {
            System.out.println("Chica te encontrou");
            System.out.println("FIM DE JOGO");
        }
        if (playerChoice == 6 && escolhaSala.cozinha == attackFoxy.actionFoxy) {
            System.out.println("Foxy te encontrou");
            System.out.println("FIM DE JOGO");
        }
        if (playerChoice == 6 && escolhaSala.cozinha == attackBonnie.actionBonnie){
            System.out.println("Bonnie te encontrou");
            System.out.println("FIM DE JOGO");
        }

        if (playerChoice == 7 && escolhaSala.cozinha != attackFreedy.actionFreddy) {
            System.out.println("VOCÊ SE ESCONDEU NA SALA DE SEGURANÇA");
            System.out.println("Freddy não te encontrou");
        }
        if (playerChoice == 7 && escolhaSala.cozinha != attackChica.actionChica) {
            System.out.println("Chica não te encontrou");
        }
        if (playerChoice == 7 && escolhaSala.cozinha != attackFoxy.actionFoxy) {
            System.out.println("Foxy não te encontrou");
        }
        if (playerChoice == 7 && escolhaSala.cozinha != attackBonnie.actionBonnie){
            System.out.println("Bonnie não te encontrou");
        }
        //Caso te encontrem
        if (playerChoice == 7 && escolhaSala.cozinha == attackFreedy.actionFreddy) {
            System.out.println("Freddy te encontrou");
            System.out.println("FIM DE JOGO");
        }
        if (playerChoice == 7 && escolhaSala.cozinha == attackChica.actionChica) {
            System.out.println("Chica te encontrou");
            System.out.println("FIM DE JOGO");
        }
        if (playerChoice == 7 && escolhaSala.cozinha == attackFoxy.actionFoxy) {
            System.out.println("Foxy te encontrou");
            System.out.println("FIM DE JOGO");
        }
        if (playerChoice == 7 && escolhaSala.cozinha == attackBonnie.actionBonnie){
            System.out.println("Bonnie te encontrou");
            System.out.println("FIM DE JOGO");
        }

    }}

//NÃO ESTA PRONTO, PRECISA FINALIZAR!
