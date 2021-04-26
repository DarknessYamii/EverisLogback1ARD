package com.everis.log4h.EverisLogback1ARD;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Methods Logger
 * 
 * FORMACION EVERIS DUAL - FP - LogBack Project Prueba LOGBACK
 * 
 * @author aruidelg
 *
 */
public class App {
	final static Logger LOGGER = LoggerFactory.getLogger(App.class);
	Scanner scanner = new Scanner(System.in);

	/**
	 * Metodo cuadrado
	 */
	public void cuadrado() {
		LOGGER.info("Metodo area cuadrado");
		try {

			System.out.println("1. Area por diagonal 2. Area por lado");
			int opcion = scanner.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduzca longitud de la diagonal");
				int diagonal = scanner.nextInt();
				LOGGER.info("Introduccion de la diagonal");
				int area = (diagonal * diagonal) / 2;
				System.out.println("El area del cuadrado es " + area);
				LOGGER.info("Mostrar resultado del area apartir de diagonal");
				break;
			case 2:
				System.out.println("Introduzca longitud del lado");
				int lado = scanner.nextInt();
				LOGGER.info("Introduccion del lado");
				int arealado = lado * lado;
				System.out.println("El area del cuadrado es: " + arealado);
				LOGGER.info("Mostrar resultado del area apartir del lado");
				break;
			default:
				LOGGER.info("Opcion default");
				break;

			}
		} catch (Exception e) {
			LOGGER.error("Exception found");
			System.err.println("El valor no es numerico");
			LOGGER.info("Exiting");
			System.exit(0);
		}
	}

	/**
	 * Metodo circulo
	 */
	public void circulo() {
		LOGGER.info("Metodo area Circulo");
		try {
			System.out.println("Introduzca el radio de la circunferancia");
			double radio = scanner.nextInt();
			LOGGER.info("Radio de la circunferencia establecido");
			double superficie = Math.PI * radio * radio;
			System.out.println("La superficie del circulo es: " + superficie);
			LOGGER.info("Mostrar superficie del circulo");
		} catch (Exception e) {
			LOGGER.error("Exception found");
			System.err.println("El valor no es numerico");
			LOGGER.info("Exiting");
			System.exit(0);
		}
	}

	/**
	 * Metodo rectangulo
	 */
	public void rectangulo() {
		LOGGER.info("Metodo area Rectangulo");
		try {
			System.out.println("Introduzca base del rectangulo");
			int base = scanner.nextInt();
			LOGGER.info("Base del rectangulo recogida");
			System.out.println("Introduzca altura del rectangulo");
			int altura = scanner.nextInt();
			LOGGER.info("Altura del rectangulo recogida");
			int rectangulo = base * altura;
			System.out.println("El area del rectangulo es: " + rectangulo);
			LOGGER.info("Mostrar area del rectangulo");
		} catch (Exception e) {
			LOGGER.error("Exception found");
			System.err.println("El valor no es numerico");
			LOGGER.info("Exiting");
			System.exit(0);
		}
	}

	public void menu() {
		LOGGER.info("Metodo menu");
		while (true) {
			try {

				LOGGER.info("Into While");
				System.out.println("Que figura desea saber su area\n1.Cuadrado\n2.Circulo\n3.Rectangulo\nSalir(cualquier valor no mencionado)");
				int opcion = scanner.nextInt();
				switch (opcion) {
				case 1:
					LOGGER.info("Option 1");
					cuadrado();
					LOGGER.info("Exit Option 1");
					break;
				case 2:
					LOGGER.info("Option 2");
					circulo();
					LOGGER.info("Exit Option 2");
					break;
				case 3:
					LOGGER.info("Option 2");
					rectangulo();
					LOGGER.info("Exit Option 2");
					break;

				default:
					LOGGER.info("Default Option");
					LOGGER.info("Exiting");
					System.exit(0);
					break;
				}
			} catch (Exception e) {
				LOGGER.error("Exception found");
				System.err.println("El valor no es numerico");
				System.exit(0);
			}
		}
	}

}
