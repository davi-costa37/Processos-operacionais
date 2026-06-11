💻 System Process Controller (Java)
Este projeto apresenta um controlador em Java projetado para realizar duas tarefas fundamentais de integração com o sistema operacional: 
coletar metadados do ambiente de execução (Nome, Versão e Arquitetura do S.O.) e inicializar processos externos de forma dinâmica através do terminal.

⚙️ Funcionalidades
A classe ProcessosController expõe dois métodos de utilidade do sistema:

Leitura de Informações do Sistema (os): Acessa as propriedades nativas da Máquina Virtual Java (JVM) utilizando System.getProperty para coletar e exibir formatadamente os dados do sistema operacional hospedeiro.

Execução Avançada de Processos (callProcess): Tenta executar um comando ou aplicativo externo pelo nome informado. 
O método possui uma lógica de contorno (fallback) para o Windows: caso ocorra o erro de permissão padrão 740 (que exige elevação de privilégios de administrador), o código reconstrói o comando encapsulando-o dentro de uma instância do prompt de comando nativo (cmd /c) utilizando um StringBuffer.

🛠️ Tecnologias e Métodos
Linguagem: Java (JDK 8 ou superior)

APIs Utilizadas: java.lang.System (propriedades de ambiente) e java.lang.Runtime (gerenciamento de processos executáveis).

Estrutura Auxiliar: StringBuffer para concatenação segura e performática de strings de comando.

🚀 Estrutura do Código
Os dois métodos públicos fornecidos pela classe são:

public void os(): Imprime no console a linha informativa do sistema.

public void callProcess(String proc): Inicializa um programa externo (ex: "notepad.exe", "calc", ou comandos bash/cmd).

📄 Licença
Este projeto está sob a licença MIT.
