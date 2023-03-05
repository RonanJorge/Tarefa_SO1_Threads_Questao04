package controller;

public class ThreadSapos extends Thread{
	int n;
	int pos;
	
	public ThreadSapos(int n, int pos) {
		this.n = n;
		this.pos = pos;
	}
	@Override
	public void run() {
		int soma = 0;
		while(soma < 20) {
			int a = (int)(Math.random()*11);
			soma = soma + a;
			System.out.println("Sapo " + n + " Salto = "+ a + " metros. Percorrido = "+ soma + " metros.");
		}
		System.out.println("O sapo "+ n + " chegou!");
	}
}

