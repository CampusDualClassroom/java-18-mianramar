package com.campusdual.classroom;

public class Exercise18 {

	public static int[] createAndInitializeArray(int elementos){
		int[] array = new int[elementos];
		for (int i = 0; i < elementos; i++){
			array[i] = i + 1;
		}
		return array;
	}

	public static void showInlineArray(int[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			// si no es el último elemento le añadimos un espacio
			if (i < array.length -1){
				System.out.println(" ");
			}
		}
	}

	public static void main(String[] args) {

		int[] nuevoArray = createAndInitializeArray(5);

		showInlineArray(nuevoArray);
	}


}
