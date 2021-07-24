package HelpMe;

class Help{
void helpOn(int what) {
	switch(what) {

case '1':
	System.out.println(" \n The if:");
	System.out.println("if (condition) statment;");
	System.out.println("else statment");
	break;
	
case '2':
	System.out.println("The switch:\n");
	System.out.println("Switch(expression) {");
	System.out.println("   case constat:");
	System.out.println("       statment sequence");
	System.out.println("        break;");
	System.out.println("  // ...");
	System.out.println("}");
	break;

case '3':
	System.out.println("The for:\n");
	System.out.println("for(init; condition; iteration)");
	System.out.println(" statment;");
	break;

case '4':
	System.out.println("The while:\n");
	System.out.println("While(condition) statment;");
	break;

case '5':
	System.out.println("The do-while: \n");
	System.out.println("do {");
	System.out.println(" statment;");
	System.out.println("} while (condition);");
	break;
	
case '6':
	System.out.println("The break: \n");
	System.out.println("break; or break label;");
	break;
	
case '7':
	System.out.println("The continue: \n");
	System.out.println("continue; or continue label;");
	break;
	}
System.out.println();
}


void showMenu () {
	System.out.println("Me ajude com a sitaxe de: ");
	System.out.println("1. IF");
	System.out.println("2. SWITCH");
	System.out.println("3. FOR");
	System.out.println("4. WHILE");
	System.out.println("5. DO-WHILE");
	System.out.println("6. Break");
	System.out.println("7. Continue \n");
	System.out.print("Escolha uma opção ou pressione a tecla 'q' para sair:  ");
}


boolean isValid (int ch) {
	if (ch < '1' | ch > '7' & ch != 'q') return false;
	else return true;
	}
}

