package controller;

public class ThreadSapos extends Thread{
	int n;
	int salto;
	int dist;
	
	public ThreadSapos(int n, int salto, int dist) {
		this.n = n;
		this.salto = salto;
		this.dist = dist;
	}
	@Override
	public void run() {
		int soma = 0;
		while(soma < dist) {
			int a = (int)(Math.random()*(salto + 1));
			soma = soma + a;
			System.out.println("Sapo " + n + " Salto = "+ a + " metros. Percorrido = "+ soma + " metros.");
		}
		System.out.println("O sapo "+ n + " chegou!");
	}
}

