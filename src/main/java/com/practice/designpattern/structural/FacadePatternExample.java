package com.practice.designpattern.structural;

public class FacadePatternExample {
	public static void main(String[] args) {
		Amplifier amplifier = new Amplifier();
		DVDPlayer dvdPlayer = new DVDPlayer();
		Projector projector = new Projector();
		Screen screen = new Screen();
		Lights lights = new Lights();

		HomeTheaterFacade facade = new HomeTheaterFacade(amplifier, dvdPlayer, projector, screen, lights);
		facade.watchMovie("Transformers");
		facade.endMovie();
	}
}

class Amplifier {
	public void on() {
		System.out.println("Amplifier on");
	}

	public void off() {
		System.out.println("Amplifier off");
	}

	public void setVolume( int level) {
		System.out.println("Setting volume level to "+ level);
	}
}

class DVDPlayer {
	public void on() {
		System.out.println("DVDPlayer on");
	}

	public void off() {
		System.out.println("DVDPlayer off");
	}

	public void playMovie(String movie) {
		System.out.println("playing movie "+movie);
	}
}

class Projector {
	public void on() {
		System.out.println("Projector on");
	}

	public void off() {
		System.out.println("Projector off");
	}

	public void wideScreenMode() {
		System.out.println("Projector in widescreen mode");
	}
}
 class Screen {
	public void down() {
		System.out.println("Screen down");
	}
	public void up() {
		System.out.println("Screen up");
	}
}
class Lights {
	public void dim(int level) {
		System.out.println("Lights dimming to " + level + "%");
	}
}

class HomeTheaterFacade {
	private Amplifier amp;
	private DVDPlayer dvd;
	private Projector projector;

	private Screen screen;

	private Lights lights;

	public HomeTheaterFacade(Amplifier amp, DVDPlayer dvd, Projector projector, Screen screen, Lights lights) {
		this.amp = amp;
		this.dvd = dvd;
		this.projector = projector;
		this.screen = screen;
		this.lights = lights;
	}

	public void watchMovie(String movie) {
		System.out.println("Get ready to watch a movie...");
		lights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setVolume(5);
		dvd.on();
		dvd.playMovie(movie);
	}

	public void endMovie() {
		System.out.println("Shutting movie theater down...");
		lights.dim(100);
		screen.up();
		projector.off();
		amp.off();
		dvd.off();
	}
}