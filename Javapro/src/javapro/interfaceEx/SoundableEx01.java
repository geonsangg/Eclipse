package javapro.interfaceEx;

public class SoundableEx01 {

	public static void main(String[] args) {
		printSound(new CFCat());
		printSound(new CFDog());
	}

	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

}
