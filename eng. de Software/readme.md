REPOSITORIO ENGENHARIA DE SOFTWARE
11/08

We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. 
On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. 
In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as 
well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with 
higher-stakes outcomes, often based on imprecise estimates of time and 
growth.
Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming.

Atividade 1 
Escreva com suas palavras o que entendeu do texto:
o texto destaca como a engenharia de software transcende a programação ao considerar aspectos como tempo, escala e compromissos, e como essa perspectiva mais ampla é fundamental para projetar, desenvolver e manter sistemas de software eficazes e bem-sucedidos.

14/08


Atividade 2 
diferenciar requisitos funcionais e não funcionais, por exemplo
Escolha outro exemplo e faça a mesma atividade
dentre os serviços de carona compartilhada, a Uber e a 99 taxi sao aplicações semelhantes, porem a uber tem um alcance muito maior

cite 3 casos de trade off

1. **Comércio Eletrônico - Velocidade de Entrega vs. Custo:** Uma empresa de comércio eletrônico pode enfrentar o trade-off entre oferecer opções de entrega rápida e manter custos baixos. Garantir a entrega no mesmo dia pode aumentar significativamente os custos de logística, enquanto o frete padrão pode ser mais barato, porém mais lento. A empresa precisa decidir o equilíbrio ideal entre a satisfação do cliente (entrega rápida) e a lucratividade (custos de envio mais baixos).

2. **Desenvolvimento de Software - Velocidade vs. Qualidade:** Uma equipe de desenvolvimento de software pode enfrentar o trade-off entre lançar um produto no mercado o mais rápido possível e garantir uma qualidade excepcional. Desenvolver um produto rapidamente pode significar cortar testes extensivos ou aprimoramentos de recursos, o que poderia comprometer a qualidade. Encontrar um equilíbrio entre lançamento oportuno e qualidade é crucial.

3. **Tecnologia - Portabilidade vs. Desempenho:** Ao escolher um dispositivo, como um laptop ou celular, os consumidores podem se deparar com o trade-off entre portabilidade e desempenho. Dispositivos mais leves e portáteis podem sacrificar o desempenho em comparação com modelos mais pesados e robustos, que geralmente têm mais poder de processamento. Decidir entre a mobilidade e o desempenho necessário para determinadas tarefas é um trade-off comum na escolha de dispositivos tecnológicos.

Atividade 3: 
Aponte dentro das 10 Heurisiticas da usabilidade 1 acerto e 1 erro .
As "10 Heurísticas de Usabilidade" são um conjunto de princípios propostos por Jakob Nielsen, um renomado especialista em usabilidade, para avaliar a qualidade das interfaces de usuário. Essas heurísticas são diretrizes que os designers de interfaces podem seguir para criar produtos mais usáveis e eficazes. Aqui estão as 10 heurísticas de usabilidade:

1. **Visibilidade do status do sistema:** O sistema deve manter os usuários informados sobre o que está acontecendo, fornecendo feedback adequado em tempo hábil sobre suas ações e o estado atual.

O Youtube, por exemplo, disponibiliza uma barra lateral informando qual vídeo estamos vendo, quais já foram assistidos e quais são os próximos da lista.

![exemplo+1+de+heuristica png](https://github.com/gabmota8/Bertoti/assets/44507787/06a3fd42-30d5-4079-b61e-f6919d44fc5e)


2. **Correspondência entre o sistema e o mundo real:** A linguagem utilizada na interface deve refletir os termos, conceitos e processos familiares aos usuários, em vez de usar jargões técnicos ou desconhecidos.
Para estabelecer essa comunicação, é possível utilizar ícones, por exemplo, que representam uma determinada ação. Como o símbolo de telefone nos smartphones que significa, geralmente, fazer ligações.



[exemplo+2+heuristicas webp](https://github.com/gabmota8/Bertoti/assets/44507787/2f1754fc-6b98-4399-95b9-dddcfa391651)


3. **Controle e liberdade do usuário:** Os usuários devem ter a capacidade de desfazer ações indesejadas ou errôneas e explorar livremente o sistema sem consequências irreversíveis.
 No entanto, é preciso levar em consideração que o usuário pode tomar uma ação errada ou se arrepender da decisão que tomou. Por isso, é necessário pensar em funções como undo e redo para que o usuário consiga desfazer e refazer suas ações conforme suas necessidades.


![exemplo 3 de heuristica webp](https://github.com/gabmota8/Bertoti/assets/44507787/cc1aad4c-2426-4b48-9753-5a406b94ec45)



5. **Consistência e padrões:** Elementos da interface, como cores, ícones e palavras, devem ser consistentes em todo o sistema para criar uma experiência coerente e familiar.
Nesse sentido, durante a interação, os usuários não devem ter dúvidas sobre o significado das palavras, ícones ou símbolos utilizados.

Portanto, é fundamental que uma interface siga as convenções da plataforma, mantendo padrões de interação em diversos e diferenciados contextos.

O UX Designer deve criar uma interface que fale a mesma língua o tempo todo e trate coisas similares da mesma maneira. Assim, facilitará que o usuário identifique o padrão existente naquela interface.

![exemplo 4 de heuristica webp](https://github.com/gabmota8/Bertoti/assets/44507787/c251a4e0-2b3a-4de8-9f60-8d880855fa34)


5. **Prevenção de erros:** O design deve ser pensado para evitar erros, seja através de mensagens de confirmação, restrições inteligentes ou guias claras para ações críticas.
   Essa heurística de Nielsen propõe que a interface esteja apta a prevenir qualquer tipo de ação descuidada do usuário.

Pense em um botão de excluir arquivos, por exemplo. Devemos pensar que o usuário pode clicar nesse botão sem querer ou que ele imaginava uma função diferente para essa ação.

Dessa forma, para prevenirmos que o usuário se frustre ao ter os arquivos deletados, é importante criar uma mensagem de aviso da ação, para que haja a confirmação ou não da decisão.

![exemplo+5+de+heuristica webp](https://github.com/gabmota8/Bertoti/assets/44507787/07b34182-e125-4f1f-a198-9dde2a9e739a)


6. **Reconhecimento em vez de lembrança:** As informações relevantes devem ser visíveis e disponíveis, evitando a necessidade de os usuários memorizarem detalhes ou informações complexas.

É importante pensar em maneiras de deixar ícones e elementos de ação sempre visíveis e que as informações estejam presentes de forma fácil. Nós temos a tendência de ter mais facilidade em reconhecer do que lembrar de algo.

O usuário não deve ter que se lembrar de todas as ações ou funções da interface. Portanto, é importante sempre deixar à disposição pequenos lembretes das informações que podem ser úteis a ele.

![exemplo 6 d heurisitica webp](https://github.com/gabmota8/Bertoti/assets/44507787/0494b09a-0946-49c4-b903-ae856b7d67d7)

7. **Flexibilidade e eficiência de uso:** O sistema deve acomodar tanto os usuários inexperientes quanto os experientes, permitindo atalhos e ações que acelerem o processo para aqueles que estão mais familiarizados.
Os usuários inexperientes precisam de informações mais detalhadas. Mas conforme eles vão se aprimorando com o uso da interface, passam a utilizá-la de forma mais customizada, por exemplo, criando atalhos de teclado.

Dessa modo, é fundamental que o UI Designer permita que os usuários de sua interface personalizem ações frequentes, como atalhos de teclados e preenchimento automático de dados. Isso aprimora a eficiência e flexibilidade de uma interface.

![exemplo 7 de heuristica webp](https://github.com/gabmota8/Bertoti/assets/44507787/69018d04-b0f5-47fe-b85f-61632d9778f4)

8. **Estética e design minimalista:** As interfaces devem ser esteticamente agradáveis e livres de elementos desnecessários que possam distrair ou confundir os usuários.
O Designer Visual deve criar diálogos que contenham somente informações relevantes. Ou seja, evitar o uso desnecessário de elementos visuais que possam confundir o usuário. Cada unidade extra de informação em um diálogo compete com uma unidade de informação relevante e acaba por diminuir sua visibilidade.

![exemplo 8 de heurisitica webp](https://github.com/gabmota8/Bertoti/assets/44507787/b18810d6-d91d-4446-885b-e66823f65f14)

9. **Ajuda e documentação:** Quando necessário, deve haver acesso fácil a informações relevantes para ajudar os usuários a compreender o sistema e solucionar problemas.
No entanto, mais importante ainda é ajudar o usuário a identificar e encontrar soluções para os problemas e erros encontrados durante a interação.

As mensagens de erro devem ser expressas em uma linguagem simples; sem códigos, clara e que indique precisamente o problema e sugira uma solução.

![exemplo 9 de heuristica webp](https://github.com/gabmota8/Bertoti/assets/44507787/20839f06-6453-4306-a92c-7c7f92b1491a)

10. **Reconhecimento, diagnóstico e recuperação de erros:** Erros devem ser comunicados de forma clara e indicar soluções eficazes para corrigi-los, de modo que os usuários possam entender e superar problemas sem dificuldade.
Apesar de todas as heurísticas listadas ajudarem a evitar erros e solicitação de ajuda por parte do usuário, é importante pensar em maneiras de auxiliá-lo a qualquer momento de sua interação.

Uma solução bastante popular são os FAQs, nos quais são compiladas as principais e mais frequentes dúvidas e suas respectivas soluções.

![exemplo 10 de heuristica webp](https://github.com/gabmota8/Bertoti/assets/44507787/ad134900-5217-47f3-8303-e66ed9ddbcc3)

Redija um acerto e erro de cada um dos exemplos das heuristicas

1. **Visibilidade do status do sistema:**
   - Acerto: Quando um aplicativo de mensagens exibe um indicador de "mensagem enviada" imediatamente após o usuário enviar uma mensagem.
   - Erro: Um sistema bancário online que não exibe nenhum feedback após o usuário iniciar uma transferência de fundos, deixando-o sem saber se a ação foi concluída com sucesso.

2. **Correspondência entre o sistema e o mundo real:**
   - Acerto: Um aplicativo de edição de texto utiliza ícones familiares, como uma tesoura para "recortar" e uma lixeira para "excluir".
   - Erro: Um software de edição de imagens usa termos técnicos pouco conhecidos em seus menus, como "Desatenuar" em vez de "Clarear".

3. **Controle e liberdade do usuário:**
   - Acerto: Um software de edição permite que os usuários desfaçam e refaçam várias ações usando atalhos de teclado e botões visíveis.
   - Erro: Uma plataforma de compras online que não permite que os usuários cancelem um pedido depois que ele é colocado, sem nenhuma opção de reversão.

4. **Consistência e padrões:**
   - Acerto: Um conjunto de aplicativos de uma mesma empresa utiliza a mesma paleta de cores e disposição de menus em todas as interfaces.
   - Erro: Um aplicativo de gerenciamento de tarefas tem diferentes ícones para a mesma função em diferentes telas, causando confusão.

5. **Prevenção de erros:**
   - Acerto: Um sistema de reservas de voo exibe uma mensagem de confirmação antes de finalizar uma reserva, evitando erros acidentais.
   - Erro: Um aplicativo de edição de imagens não solicita confirmação ao usuário antes de descartar alterações não salvas.

6. **Reconhecimento em vez de lembrança:**
   - Acerto: Um aplicativo de e-commerce exibe as opções de pagamento diretamente na página de checkout, eliminando a necessidade de os usuários lembrarem as opções.
   - Erro: Um aplicativo de planejamento de viagens não mostra as datas das reservas na tela principal, obrigando os usuários a lembrar os detalhes.

7. **Flexibilidade e eficiência de uso:**
   - Acerto: Um editor de código permite que os usuários configurem atalhos personalizados para funções frequentemente usadas.
   - Erro: Um software de edição de vídeo não oferece opções de atalhos de teclado, forçando os usuários a clicar repetidamente nos menus.

8. **Estética e design minimalista:**
   - Acerto: Um aplicativo de leitura de notícias apresenta um layout limpo, com foco nas manchetes e imagens, sem excesso de elementos visuais.
   - Erro: Um site de comércio eletrônico sobrecarrega suas páginas de produtos com animações e pop-ups, tornando a navegação confusa.

9. **Ajuda e documentação:**
   - Acerto: Um software de edição de fotos incorpora uma base de conhecimento acessível por meio de uma opção de "Ajuda" que oferece orientações detalhadas.
   - Erro: Um aplicativo de produtividade não fornece nenhuma forma de suporte ou documentação para auxiliar os usuários em suas tarefas.

10. **Reconhecimento, diagnóstico e recuperação de erros:**
    - Acerto: Um aplicativo de gerenciamento financeiro apresenta uma mensagem clara e sugere possíveis soluções quando o usuário tenta inserir uma transação duplicada.
    - Erro: Um sistema de reservas de restaurantes exibe um erro genérico sem informações sobre como resolver um problema ao tentar fazer uma reserva.

      
 21/08
   
      Atividade 4 : Fazer um diagrama de caso de uso com os requisitos funcionais


![SISTEMA GABRIEL DE BUSCA DE EMPREGO](https://github.com/gabmota8/Bertoti/assets/44507787/46a62c05-bf82-4552-9bc6-48147a5bb9a2)



Ativadade 5: criar uma Classe UML do nosso caso de uso.






![Classe UML](https://github.com/gabmota8/Bertoti/assets/44507787/d72b55f6-5bca-4106-a69e-b59f34b7f89e)

      
      

