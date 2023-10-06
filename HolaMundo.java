import java.io.File;

public class HolaMundo {

	public static void main(String args[])
	{
		File fichero = new File("FicheroEjemplo.txt");
		
		if (fichero.exists()) {
			printInfoFich(fichero);
		}
		else System.out.println("Fichero no encontrado ");
	}

	private static void printInfoFich(File fichero) {
		System.out.println("Nombre del archivo "+ fichero.getName());
		System.out.println("Ruta "+ fichero.getPath());
		System.out.println("Ruta absoluta "+ fichero.getAbsolutePath());
		System.out.println("Se puede leer "+fichero.canRead());
		System.out.println("Se puede escribir "+fichero.canWrite());
		System.out.println("Tamaño "+fichero.length());
	}
}
