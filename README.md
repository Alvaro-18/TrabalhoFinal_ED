# TrabalhoFinal_ED
Trabalho feito para a disciplina de Estrutura de Dados para obtensão das notas da 2° e 3° unidade do 3° semestre do curso de Sistemas de Informação, do Intituto Federal de Educação, Ciência e Tecnologia da Bahia campus Vitória da Conquista.

# Descrição do trabalho:
Neste projeto, propõe-se gerenciar venda de ingressos de determinado cinema, considerando-se, para tal, programação específica do
dia corrente. O uso de coleções genéricas concretas para a manipulação das listas de sessões e seus respectivos ingressos é
obrigatório. Inicialmente, deverá se proceder com a definição das sessões de cinema, informando-se para cada uma delas: 
a)título do filme;
b)duração em minutos;
c)horário;
d)tipo de produção (nacional ou estrangeira);
e)tipo de áudio (original, original com legenda ou dublado);
f)reprodução ou não em 3D;
g)número da sala;
h)capacidade da sala em expectadores.
Também é necessário estabelecer valor da entrada inteira considerando-se possibilidade da oferta de meia entrada e, em se tratando de sessão de 3D, majoração do ingresso em 25%. Conhecida a programação do cinema no dia corrente, abre-se venda de ingressos, exigindo-se de cada expectador dados sobre tipo de entrada (inteira ou meia) e número de poltrona. A aplicação desenvolvida deve dispor das seguintes funcionalidades e/ou restrições:
• Inclusão, alteração e exclusão de sessões de cinema, sendo tais operações vedadas após abertura da comercialização de
ingressos;
• Impedimento da inclusão ou atualização de sessões de cinema de tal modo que duas ou mais delas ocorram em mesmo horário /
ou ainda que levam ao encerramento de uma sessão em horário que implique em intervalo de tempo para a sessão seguinte, se
houver, inferior à 20 minutos;
• Impedimento de registro de sessões de cinema de modo que duas ou mais delas ocorram em uma mesma sala com capacidades
de expectadores diferentes (aqui sugere-se indicação automática de capacidade da sala em caso de registro de sessão em sala
para a qual já há registro de outras sessões, quando do registro de nova sessão);
• Registro de venda de ingressos, considerando-se algumas restrições, a saber: 
a)venda de dois ou mais ingressos para uma mesma sessão de cinema e poltrona, admitindo-se que as poltronas estão numeradas entre 1 (um) e a capacidade da sala de exposição do filme;
• Cancelamento de venda de ingresso a partir da indicação da sessão de cinema e do número de poltrona;
• Consultas sobre os dados de sessões de filmes e venda de ingressos, a saber: 
a)grade de programação, com apresentação, em cada sessão, de nome do filme, número da sala, tipo de produção, tipo de áudio e horário;
b)números de poltronas disponíveis em determinada sessão de cinema, a ser indicada pelo próprio usuário;
c)taxa de ocupação de cada sessão;
d)faturamento com base em ingressos comercializados, devendo haver distinção entre entradas inteiras, entradas inteiras de sessões 3D, meia entradas e meias entradas de sessões 3D.