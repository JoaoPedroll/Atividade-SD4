public class Atividade4 extends Thread{

    @Override
    public void run() {
        System.out.println("ID d Thread: " + Thread.currentThread().getId());
    }

    public static void main(String[] args) {

        Atividade4 t1 = new Atividade4();
        Atividade4 t2 = new Atividade4();

        t1.start();
        t2.start();

    }
}