#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int i,j=0;

int conteoCorpus();//cuenta liNEAS DEL CORPUS CADA QUE HAY UN SALTO DE LINEA
int conteoArchivo();//cuenta liNEAS DEL CORPUS CADA QUE HAY UN SALTO DE LINEA
void diccionarioSet();//LLAMAR A CONTEO CORPUS, SE OBTIEE ESE NUMERO, EN LA MATRIZ PONER LAS PALABRAS DEL CORPUS
void textoGet();//lLAMA A CONTEO ARCHIVO, OBTIENE TODAS LAS LINEAS DE ARCHIVO Y GUARDA EN OTRA MATRIZ
void comprarYEvaluar();
void menu();
void motivacional();

struct Matrices
{
	char diccionario[300][15];
	char palabras[300][30];
} mat;
struct Contadores
{
	int l,m;
	//m palabras del corpus, //l palabras de archivo a analizar
	int depresivo;
} cont;
void menu()
{
	system("color 1F");
	diccionarioSet();
	int op=0;
	do
	{
		op=0;
		system("cls");
		printf("\n                                        -------------------------         ");
		printf("\n                                        | DETECTOR DE DEPRESION |         ");
		printf("\n                                        -------------------------  \n");
		printf("\n\nArchivo de Corpus disponible para su analisis");	
		printf("\n\nPor favor elija una opcion\n\n");	
		printf("1) Abrir el Archivo y leer su contenido\n");
		printf("2) Analizar el texto y obtener resultados\n");
		printf("3) Recomendar\n");
		printf("4) Salir\n\n");
		scanf("%i",&op);
		switch(op)
		{
			case 1:
				textoGet();	
				op=0;	
				break;
			case 2:
				comprarYEvaluar();
				op=0;
				break;
			case 3:
				printf("\n\n");
				motivacional();
				system("pause");
				op=0;
				break;
			case 4:
				exit(0);
				break;
			default:
			  	system("color 4F");
				system("cls");
				printf("\nERROR: Opcion incorrecta \n");
				system("pause");
				system("color 9F");
				op=0;
			break;
		}	

	} while(op<5);

}
int conteoCorpus()
{
	FILE *temp = NULL;
	temp = fopen("corpus.txt", "r"); 
	int count=1;
	char c;
	if (temp == NULL) 
    {
    	system("cls");
     	printf("\nERROR: El archivo de diccionario no se pudo abrir\n");
		system("pause");
		exit(1);
    } 
	 for (c = getc(temp); c != EOF; c = getc(temp)) 
	 {
	 	  if (c == '\n')
	 	  	count++;    
	 }
      
          		
    fclose(temp);
    return count;
}
int conteoArchivo()
{
	FILE *temp = NULL;
	temp = fopen("captura.txt", "r"); 
	int count=1;
	char c;
	if (temp == NULL) 
    { 
    	system("cls");
     	printf("\nERROR: El archivo de texto no se pudo abrir\n");
		system("pause");
    } 
	 for (c = getc(temp); c != EOF; c = getc(temp)) 
        if (c == '\n')
          	count++; 
          		
    fclose(temp); 
    return count;
}
void diccionarioSet()
{
	FILE *dicStream=NULL; //abre el archivo del corpus para obtener las palabras
	char buffer[15]; //mantiene temporalmente la palabra del corpus
	
	int linea=conteoCorpus();
	
	dicStream=fopen("corpus.txt", "r");
	
	if (dicStream==NULL)
	{
		system("cls");
		printf("\nERROR: El archivo de diccionario no se pudo abrir\n");
		system("pause");
		exit(1);
	}

	while(fgets(buffer, sizeof buffer, dicStream)!=NULL) 
	 {    
		int tam=strlen(buffer);
			if( buffer[tam-1] == '\n' )
   		 		buffer[tam-1] = 0;
				  		 	
		strcpy(mat.diccionario[cont.m], buffer);
		cont.m++;
    }
	fclose(dicStream);	
}
void textoGet()
{
	FILE *arcStream=NULL; 
	char* token;
	int k=0;
	char texto[100][500];
	char buffer[500];
	int linea=conteoArchivo();
	
	arcStream=fopen("captura.txt", "r");
	
	if (arcStream==NULL)
	{
		system("cls");
		printf("\nERROR: El archivo de texto no se pudo abrir\n");
		system("pause");
		exit(1);
	}

	while(fgets(buffer, sizeof buffer, arcStream)!=NULL) 
	 {    
		int tam=strlen(buffer);
		if( buffer[tam-1] == '\n' )
   		 	buffer[tam-1] = 0;
   		strcpy(texto[k], buffer);	 	
		k++;
    }
    
    system("cls");
    printf("\n\n //////////////////////////El texto propuesto es://///////////////////////////// \n\n\n\n");
    
   	for(i=0; i<linea; i++)
	{ 
   		printf("%s\n",texto[i]);
	}
   
 	for(i=0; i<linea; i++)
	{ 
		//Obtiene la primera palabra de la linea del archivo a analizar
		char* token = strtok(texto[i], " "); 
		
		if(token!=NULL)
        {
     		strcpy(mat.palabras[cont.l], token);
     		//pasa directamente a la matriz de palabra
		}
		cont.l++;
		//fin
		
    	while (token != NULL) 
    	{ 
         	token = strtok(NULL, ",. \t");
         	if(token==NULL)
         	{
         		break;
			}
         	strcpy(mat.palabras[cont.l], token);
        	cont.l++;
    	} 
	}
	
	printf("\n");
	system("pause");
    fclose(arcStream);
}
void comprarYEvaluar()
{
	if(cont.l<=0)
	{
		system("color 4F");
		system("cls");
		printf("\nERROR: Al parecer no se ha abierto el Archivo a analizar previamente\n");
		system("pause");
		system("color 9F");
		return;
	}
	cont.l-=2; //corregir, total de palabras del corpus se sumaban dos
	int comparador=0;
	system("cls");
	printf("Analizando %i palabras del corpus y %i palabras del texto propuesto...\n\n",cont.m,cont.l);
	for(i=0; i<cont.l; i++)
	{
		for(j=0; j<cont.m;j++)
		{
			comparador=stricmp(mat.palabras[i],mat.diccionario[j]);
			if(comparador==0)
			{
				cont.depresivo++;
			}
			
		}
	}
	
	int mult=cont.depresivo*500; // numero 100, el programa sera mas estricto (tienes que ser super fiel al corpus), a mayor numero las palabras coincidentes, el porcentaje sera mucho mas variable
	float porcentaje=(float)mult/(float)cont.l;
	
	printf("El archivo esta %.2f %% depresivo\n\n",porcentaje);
		
	if(porcentaje>25 && porcentaje<=50)
	{
		printf("Esta medianamente depresivo\n\n");	
		motivacional();
	}
	else if(porcentaje>0 && porcentaje<=25)
	{
		printf("Esta bajamente depresivo\n\n");	
	}
	else if(porcentaje>50 && porcentaje<=75)
	{
		printf("Esta altamente depresivo\n\n");	
		motivacional();
	}
	else if(porcentaje>75 && porcentaje<=100)
	{
		printf("Ya tiene un trastorno depresivo\n\n");	
		motivacional();
	}
	else if(porcentaje<=0)
	{
		printf("No esta para nada depresivo\n\n");	
	}

	system("pause");
	
}
void motivacional()
{
	time_t t;
  	srand((unsigned) time(&t));
  	
  	int opRand=rand() % 10;
  	
  	switch(opRand)
  	{
  		case 1:
  			printf("No te sientas mal, MOTIVATE\n\n");
  			printf("El mejor momento para plantar un árbol era hace 20 años. El segundo mejor momento es AHORA.\n\n");
  			break;
  		case 2:
  			printf("No te sientas mal, MOTIVATE\n\n");
  			printf("Cada dIa es una nueva oportunidad para cambiar tu vida.\n\n");
  			break;
  		case 3:
  			printf("No te sientas mal, MOTIVATE\n\n");
  			printf("Ningun mar en calma hizo experto a un marinero.\n\n");
  			break;
  	  	case 4:
  			printf("No te sientas mal, MOTIVATE\n\n");
  			printf("El exito en la vida no se mide por lo que logras sino por los obstaculos que superas\n\n");
  			break;
  	  	case 5:
  			printf("No te sientas mal, MOTIVATE\n\n");
  			printf("Manana es una excusa maravillosa, ¿No crees?\n\n");
  			break;
  	 	case 6:
  			printf("No te sientas mal, MOTIVATE\n\n");
  			printf("Cuando te das cuenta que estas procrastinando preguntarte: ¿De que estoy intentando huir?\n\n");		
  			break;
  	 	case 7:
  			printf("No te sientas mal, MOTIVATE\n\n");
  			printf("Todo error deja una ensenanza, toda ensenanza deja una experiencia, y toda experiencia deja una huella\n\n");		
  			break;  
  	 	case 8:
  			printf("No te sientas mal, MOTIVATE\n\n");
  			printf("Las dificultades no existen para hacerte renunciar sino para hacerte mas fuerte\n\n");		
  			break;  
		case 9:
  			printf("No te sientas mal, MOTIVATE\n\n");
  			printf("Una persona que nunca se equivoco nunca intento nada nuevo.\n\n");		
  			break;  	
		case 10:
  			printf("No te sientas mal, MOTIVATE\n\n");
  			printf("Rara vez nos damos cuenta que estamos rodeados por lo extraordinario.\n\n");		
  			break;  	
  			  			
  			
	}
	
}
int main()
{
	menu();
	return 0;
}
