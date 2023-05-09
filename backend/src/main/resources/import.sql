INSERT INTO tb_user (user_id, email, user_name, password, user_image) VALUES (1, 'jack@gmail.com', 'Jack', 'jack123', 'https://cdn4.iconfinder.com/data/icons/diversity-v2-0-volume-02/64/bandit-asian-male-cowboy-512.png');
INSERT INTO tb_user (user_id, email, user_name, password, user_image) VALUES (2, 'ryan@gmail.com', 'Ryan', 'ryan123', 'https://cdn4.iconfinder.com/data/icons/diversity-v2-0-volume-05/64/rastafarian-male-formal-512.png');
INSERT INTO tb_user (user_id, email, user_name, password, user_image) VALUES (3, 'francis@gmail.com', 'Francis', 'francis123', 'https://cdn4.iconfinder.com/data/icons/diversity-v2-0-volume-05/64/emo-asian-female-512.png');
INSERT INTO tb_user (user_id, email, user_name, password, user_image) VALUES (4, 'Anny@gmail.com', 'Anny', 'Anny123', 'https://cdn4.iconfinder.com/data/icons/diversity-v2-0-volume-05/64/emo-black-female-512.png');
INSERT INTO tb_user (user_id, email, user_name, password, user_image) VALUES (5, 'xiii@gmail.com', 'XIII', 'xiii123', 'https://cdn0.iconfinder.com/data/icons/diversity-v2-0-volume-08/64/robot-5-512.png');
INSERT INTO tb_user (user_id, email, user_name, password, user_image) VALUES (6, 'valentina@gmail.com', 'Valentina', 'valentina123', 'https://cdn4.iconfinder.com/data/icons/diversity-v2-0-volume-04/64/disc-jockey-white-female-512.png');
INSERT INTO tb_user (user_id, email, user_name, password, user_image) VALUES (7, 'dominic@gmail.com', 'Dominic', 'dominic123', 'https://cdn4.iconfinder.com/data/icons/diversity-v2-0-volume-04/64/designers-black-male-512.png');
INSERT INTO tb_user (user_id, email, user_name, password, user_image) VALUES (8, 'shaolin@gmail.com', 'Shaolin Matador de Porco', 'shaolin123', 'https://cdn4.iconfinder.com/data/icons/diversity-v2-0-volume-04/64/designers-black-male-512.png');
INSERT INTO tb_user (user_id, email, user_name, password, user_image) VALUES (9, 'angelic@gmail.com', 'Angelic', 'angelic123', 'https://cdn2.iconfinder.com/data/icons/diversity-v2-0-volume-01/64/artist-asian-female-512.png');
INSERT INTO tb_user (user_id, email, user_name, password, user_image) VALUES (10, 'iris@gmail.com', 'Íris', 'iris123', 'https://cdn2.iconfinder.com/data/icons/diversity-avatars-volume-09/64/avatar-cloche-hat-african-woman-512.png');
INSERT INTO tb_user (user_id, email, user_name, password, user_image) VALUES (11, 'apollo@gmail.com', 'Apollo', 'apollo123', 'https://cdn2.iconfinder.com/data/icons/diversity-v2-0-volume-08/64/bowler-hat-avatar-mustache-inspector-512.png');
INSERT INTO tb_user (user_id, email, user_name, password, user_image) VALUES (12, 'gestrudes@gmail.com', 'Gertrudes', 'gertrudes123', 'https://cdn2.iconfinder.com/data/icons/diversity-avatars-volume-09/64/avatar-trenchcoat-investigator-asian-512.png');


INSERT INTO tb_post ( title, summary, views, body, user_id, post_image, created_by, created_date) VALUES ( 'Princípios básicos da Segurança da Informação', 'Porque é importante criar esforço para seguir e manter os quatro princípios da Segurança da Informação', 0, 'É imprescindível que as empresas protejam os dados dos seus clientes com todo o afinco que puderem. Na era digital, os dados são tão importantes que milhares de ataques acontecem diariamente. O Brasil se tornou o segundo maior alvo mundial de ciberataques, segundo um estudo da Netscout. Por isso, as empresas devem sempre se preocupar em gerenciar riscos e proteger as informações de acesso não autorizado, vazamentos, alterações, invasões e perdas. As ameaças à segurança da informação podem acontecer de diversas formas, desde ataques ransomwares a erros humanos. Dessa forma, a segurança da informação se baseia em quatro pilares para proteger as informações e dados: confidencialidade, integridade, disponibilidade e autenticidade.', 1, 'http://sfwallpaper.com/images/blog-wallpaper-3.jpg', 'Big Hunt', now ());
INSERT INTO tb_post ( title, summary, views, body, user_id, post_image, created_by, created_date) VALUES ( 'Confidencialidade e integridade', 'O quão importante é manter de sigílo e inalteração nos dados através dos princípios da Segurança da Informação ?', 0, 'A confidencialidade é o primeiro princípio da segurança da informação por um motivo bem simples: ele lida com a privacidade dos dados, que é fundamental para qualquer empresa que deseja garantir a segurança. Esse conceito diz respeito às ações tomadas para assegurar que as informações não sejam roubadas dos sistemas através de ciberataques, espionagem, acesso não autorizado, entre outras práticas. É pensando na confidencialidade que diversas ações preventivas podem ser tomadas, como por exemplo utilizar programas de Bug Bounty para manter os sistemas seguros, e assim proteger a confidencialidade. O princípio da integridade assegura que os dados mantenham suas características originais, ou seja, não sejam alterados indevidamente. Existe perda da integridade quando uma informação é modificada ou violada impropriamente. Por exemplo, se um funcionário alterar uma informação para simular um preço mais alto que o real, está corrompendo o princípio da integridade.', 2, 'http://sfwallpaper.com/images/blog-wallpaper-3.jpg', 'Big Hunt', now () );
INSERT INTO tb_post ( title, summary, views, body, user_id, post_image, created_by, created_date) VALUES ( 'Autencidade e Disponibilidade', 'Os limites na autoridade para um usuário acessar informações e o quanto o acesso a esta informação estará disponível', 0, 'O princípio da autenticidade garante que as informações sejam provenientes de uma fonte confiável. Em outras palavras, confirma que os dados possuem legitimidade, não havendo manipulação ou intervenções externas, como terceiros se passando por colaboradores. A autenticidade é o pilar que valida a autorização do usuário para acessar, transmitir e receber informações, como logins, senhas ou até autenticações biométricas. Um sistema autêntico confirma a identidade dos usuários antes de liberar o acesso. Para que um sistema de informação seja útil, é indispensável que seus dados estejam disponíveis quando necessário. Portanto, a disponibilidade é outro dos quatro princípios da segurança da informação, que garante o acesso em tempo integral para usuários finais. Para fazer isso, você precisa garantir a estabilidade e acesso permanente às informações dos sistemas por meio de processos de manutenção rápida, eliminação de falhas de software, atualizações contínuas e planos de gerenciamento de crises. Os sistemas são vulneráveis a desastres naturais, ataques, falta de energia e diversas outras ameaças à disponibilidade. Manter os sistemas seguros também significa garantir o máximo possível de segurança para que os dados estejam sempre disponíveis.', 3, 'http://sfwallpaper.com/images/blog-wallpaper-3.jpg', 'Big Hunt', now () );
INSERT INTO tb_post ( title, summary, views, body, user_id, post_image, created_by, created_date) VALUES ( 'Como classificar um Hacker - Parte 1', 'O termo hacker é muitas vezes usado como sinónimo de alguém que possui um alto conhecimento em manipulação de código, mas cada um destes indivíduos possuem motivações e princípios diferentes que a qual usuários mais leigos precisam saber para entender com quem podem estar lidando.', 0, 'White Hat (Hacker Ético / Chapéu branco) – São hackers que estudam sistemas de computação e redes há procura de falhas na segurança, respeitando sempre os princípios da sua ética. Quando encontram algum tipo de falhas na segurança, reportam aos responsáveis das empresas (bancos, governo, empresas comerciais) para que estes possam tomar as devidas medidas de segurança. Muitos deles aumentam as suas capacidades através de estudos e passam a exercer profissões de professores de informática ou técnicos de rede e computação; Black Hat (Chapéu preto) – São também conhecido como Dark-Side Hacker (hacker do lado negro), são aqueles que não respeitam os códigos de ética da comunidade em que se inserem. São eles que têm contribuído para denegrir a imagem dos hackers, pois utilizam os seus conhecimentos para a prática de crimes através da internet (roubo de dados e informações secretas das empresas); Grey Hat (Chapéu cinzento) – São tipos de hackers que estão entre os white hat e os black hat e que invadem sistemas apenas por diversão, no entanto não mexem nem divulgam dados interditos ou confidenciais. Muitas vezes atuam em troco de dinheiro, ou seja, exploram as vulnerabilidades do sistema de uma determinada empresa, e caso encontrem alguma, oferecem-se para a resolver a troco de dinheiro; Blue Hat (Hacker Empresarial / Chapéu azul) – São hackers contratados por diversas empresas, para testar os sistemas de segurança antes que os mesmos sejam liberados. Estes tentam encontrar quebras nos sistemas para que as mesmas possam ser resolvidas.', 4, 'http://sfwallpaper.com/images/blog-wallpaper-3.jpg', 'Filipa Cardoso', now() );
INSERT INTO tb_post ( title, summary, views, body, user_id, post_image, created_by, created_date) VALUES ( 'Como classificar um Hacker - Parte 2', 'Esta é a segunda parte do blog "Como classificar um Hacker", netsa parte conheceremos um pouco sobre os Crackers, Newbie, Phreakers, Lamers, Hackvistas, Arackers e a Elite.', 0, 'Crackers – São motivados pela conquista de conhecimento das técnicas, pela popularidade e pelo respeito que adquirem quando criam um keygen ou um crack. Eles empenham-se em perceber como o software é desenvolvido e como atua num sistema operacional para que possam falsificá-lo. No entanto os crakings são feitos de forma ilegal e sem se enquadrarem nos códigos de ética. Este termo foi criado em 1985 por hackers revoltados contra o roubo e vandalismo informático que é muitas vezes praticado pelos Crackers; Newbie (Novato) – É o nome dado a um principiante no mundo/comunidade hacker; Phreakers (Malucos) – Estes tipos de hacker são especialista em linhas telefónicas (móveis ou fixas). Embora antigamente fosse bastante fácil enganar um sistema de telefone, no entanto hoje em dia são poucos os que dominam esta arte devido à complexidade de segurança que as empresas de telecomunicações têm. Scripts Kiddies/lamer (Rapaz do script) – são hackers pouco competentes e que usam ferramentas já criadas por outras pessoas, no entanto não têm conhecimento do sistema nas suas atividades; Hacktivistas (Hacker ativista) – Termo que surge das palavras “hacker” e “ativista” e denomina hackers que manipulam códigos para promover a expressão política, liberdade de expressão, direitos humanos e ética através de computadores. Arackers (hackers de araque) – São a grande maioria dos hackers. Basicamente são pessoas que fingem ser os melhores e os mais espertos, no entanto não passam apenas de pessoas que fazem downloads do mais variado estilo ou que apenas jogam na internet jogos como “First Person Kill” ou “Killerware”. São conhecidos também como “odonto-hackers” – hackers da boca para fora. Elite – Esta é sem dúvida a minoria dos hackers. São os hackers mais respeitados e conceituados do mundo. Por norma esta posição é atingida quando se encontram em grupos de grande visibilidade ou quando desenvolvem um código completamente inovador.', 4, 'http://sfwallpaper.com/images/blog-wallpaper-3.jpg', 'Filipa Cardoso', now() );

INSERT INTO tb_comment ( body, created_date, post_id, user_id ) VALUES ( 'Concordo, todavia discordo.', now (), 1, 2 );
INSERT INTO tb_comment ( body, created_date, post_id, user_id ) VALUES ( 'Como eu faço pra acessar a câmera frontal do dispositivo de outra pessoa ?', now (), 2, 1 );
INSERT INTO tb_comment ( body, created_date, post_id, user_id ) VALUES ( 'Eu investiguei e esta informação está errada!', now (), 2, 3 );
INSERT INTO tb_comment ( body, created_date, post_id, user_id ) VALUES ( 'Como eu imprimo um vídeo ?', now (), 3, 4 );


INSERT INTO tb_chapter ( chapter_title, chapter_description, chapter_image) VALUES ( 'Desenvolvimento de Jogos Digitais', 'Neste capítulo você será apresentado a missões que iram testar os seus conhecimentos a cerca dos princípios básicos da segurança da informação, para  executar este capítulo com êxito é nescessário compreender as características de cada um dos príncipios.', 'https://makewebbetter.com/wp-content/uploads/2017/12/mainbanner1-1-1.jpg');
INSERT INTO tb_chapter ( chapter_title, chapter_description, chapter_image) VALUES ( 'Os Tipos de Hackers', 'Este capítulo será dedicado aos indivíduos que possuem uma facilidade e um conhecimento elevado em torno da manipulação código que permite o acesso a informações consideradas sigilosas, apesar que serem nomeados generalizadamente como Hackers há diferenças entre cada um deles que se dá por questões de índole ou nível de conhecimento e neste capítulos você deverá conhecer cada um deles.', 'https://avante.biz/wp-content/uploads/Cool-Hacker-Wallpapers/Cool-Hacker-Wallpapers-014.jpg');
INSERT INTO tb_chapter ( chapter_title, chapter_description, chapter_image) VALUES ( 'Controle Parental', 'A presença dos pais na internet tem se tornado mais importante a medida em que os seus filhos descobrem o mundo virtual, este capítulo irá testar seus conhecimentos sobre o controle parental na internet, qual o seu significado, suas abordagens e quais os limites desta forma de controle na internet.', 'https://yuruhuwa-hituji-life.com/wp/wp-content/uploads/2019/09/47-1-e1568971356802.png');
INSERT INTO tb_chapter ( chapter_title, chapter_description, chapter_image) VALUES ( 'Malware', 'Softwares maliciosos estão presentes nos meios digitais desde os primordios, ainda assim muito usuários demonstram dificuldades em lidar com esse tipo de problema, este capítulo irá auxiliá-lo a compreender as formas corretas de lidar com os Malwares e saber quais os tipos de softwares maliciosos são os que você está mais vulnerável.', 'https://cyberskillslesson.com/wp-content/uploads/2020/09/firewall-1-768x507.png');
INSERT INTO tb_chapter ( chapter_title, chapter_description, chapter_image) VALUES ( 'Lei Geral de Proteção de Dados Pessoais', 'Assim como no mundo real, a navegação na internet também está regida por leis, este capítulo trata de como as leis de proteção de dados são aplicadas na internet e quais os possíveis benefícios ou controvésias que este tipo de legislação pode acarrestar.', 'https://nextadmin.net/wp-content/uploads/2019/12/What-is-Data-Loss-Prevention-DLP-A-Definition-of-Data-Loss-Prevention-780x470.jpg');

INSERT INTO tb_quiz ( title, description, image, chapter_id) VALUES ( 'O Conceito no Desenvolvimento de Jogos', 'A fase de conceito no desenvolvimento de jogos é o ponto inicial das atividades. Teste os seus conhecimentos sobre esta etapa neste quizz!', 'https://1.bp.blogspot.com/-xGw8Rcwupvw/XoXsp5j7pMI/AAAAAAAAAds/NckNhfigjFIeFB_BgezgUcJd_-K3FNsCgCLcBGAsYHQ/s1600/best-game-development-interview-questions.png', 1);
INSERT INTO tb_quiz ( title, description, image, chapter_id) VALUES ( 'Fase de Planejamento no Desenvolvimento de Jogos', 'Quiz sobre a fase de planenejamento no desenvolvimento de jogos', 'https://www.dekoder.org/sites/default/files/hacker_1.png', 1);
INSERT INTO tb_quiz ( title, description, image, chapter_id) VALUES ( 'Fase de Produção no Desenvolvimento de Jogos', 'Quiz sobre a fase de produção no desenvolvimento de jogos', 'https://img.wonderhowto.com/img/20/66/63724953674051/0/expand-your-coding-skill-set-by-learning-build-games-unity.w1456.jpg', 1);
INSERT INTO tb_quiz ( title, description, image, chapter_id) VALUES ( 'Fase de Teste no Desenvolvimento de Jogos', 'Quiz sobre a fase de testes no desenvolvimento de jogos', 'https://www.dekoder.org/sites/default/files/hacker_1.png', 1);
INSERT INTO tb_quiz ( title, description, image, chapter_id) VALUES ( 'Fase de Implantação no Desenvolvimento de Jogos', 'Quiz sobre a fase de implantação no desenvolvimento de jogos', 'https://img.wonderhowto.com/img/20/66/63724953674051/0/expand-your-coding-skill-set-by-learning-build-games-unity.w1456.jpg', 1);

INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES ( 1, 'Quais os princípios básicos da Segurança da Informação ?', 1);
INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES ( 1, 'Qual atributo corresponde ao nível de sigilo de uma informação ?', 2);
INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES ( 1, 'Dados importantes em que a condição de inalteravél deve durar o máximo possível, este princípio trata-se de:', 3);
INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES ( 2, 'Qual indivíduo é responsável por um ataque autorizado com intenções justas ?', 4);
INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES ( 2, 'Invadir sistemas sem autorização, manipular códigos e coletar dados sigilosos em prol de causas sociais, éticas ou morais. Essas características referem-se ao:', 1);
INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES ( 2, 'Quem tem acesso a informações privilegiadas de uma determinada empresa é chamado de: ', 5);
INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES ( 3, 'Qual o principal propósito do controle parental ?', 1 );
INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES ( 3, 'Qual destas é uma motivação errada para a coleta de informações  sigilosas de menores ?', 4);
INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES ( 3, 'Qual o método de controle parental é considerado o mais eficaz ?', 3);
INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES ( 4, 'É um dos tipos mais antigos de malwares e difere-se de outros tipos pelo fato de ser capaz de se propagar pelas redes sem a necessidade de uma ação do usuário. Esse malware se trata do:', 2);
INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES ( 4, 'Sendo considerado um dos mais recentes e perigosos tipos de malwares, qual software malicioso é capaz de evitar diversos antivírus e se infiltrar entre os arquivos do sistema ?', 5);
INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES ( 4, 'Permite que seja retornado um invasor a um computador comprometido, através da inclusão de serviços criados para essa finalidade, esse tipo de malware é o:', 3 );
INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES ( 5, 'Qual o objetivo da Lei Geral de Proteção de Dados Pessoais ?', 1);
INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES ( 5, 'O tratamento de dados pessoais pode ser feito por dois agentes de tratamento, quais são eles ?', 2);
INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES ( 5, 'A LGPD estabelece 3 bases para o tratamento de dados direcionadas a comunicação. Quais são elas ?', 1);

INSERT INTO tb_option(question_id, choice) VALUES(1, 'Opção A')
INSERT INTO tb_option(question_id, choice) VALUES(1, 'Opção B')
INSERT INTO tb_option(question_id, choice) VALUES(1, 'Opção C')
INSERT INTO tb_option(question_id, choice) VALUES(1, 'Opção A')
INSERT INTO tb_option(question_id, choice) VALUES(1, 'Opção B')
INSERT INTO tb_option(question_id, choice) VALUES(1, 'Opção C')
INSERT INTO tb_option(question_id, choice) VALUES(1, 'Opção A')
INSERT INTO tb_option(question_id, choice) VALUES(1, 'Opção B')
INSERT INTO tb_option(question_id, choice) VALUES(1, 'Opção C')
INSERT INTO tb_option(question_id, choice) VALUES(1, 'Opção A')
INSERT INTO tb_option(question_id, choice) VALUES(1, 'Opção B')
INSERT INTO tb_option(question_id, choice) VALUES(1, 'Opção C')
INSERT INTO tb_option(question_id, choice) VALUES(2, 'Opção A')
INSERT INTO tb_option(question_id, choice) VALUES(2, 'Opção B')
INSERT INTO tb_option(question_id, choice) VALUES(2, 'Opção C')
INSERT INTO tb_option(question_id, choice) VALUES(3, 'Opção A')
INSERT INTO tb_option(question_id, choice) VALUES(3, 'Opção B')
INSERT INTO tb_option(question_id, choice) VALUES(3, 'Opção C')
INSERT INTO tb_option(question_id, choice) VALUES(4, 'Opção A')
INSERT INTO tb_option(question_id, choice) VALUES(4, 'Opção B')
INSERT INTO tb_option(question_id, choice) VALUES(4, 'Opção C')
INSERT INTO tb_option(question_id, choice) VALUES(5, 'Opção A')
INSERT INTO tb_option(question_id, choice) VALUES(5, 'Opção B')
INSERT INTO tb_option(question_id, choice) VALUES(5, 'Opção C')

INSERT INTO tb_badge ( badge_id, badge_name, badge_description, badge_image, badge_xp, chapter_id) VALUES ( 1, 'Comum Quizzer', 'Concluiu 3 Quizzes', 'https://cdn2.iconfinder.com/data/icons/quiz-filloutline/64/MEDAL-question_mark-exam-reward-winner-question-512.png', 20, 1);
INSERT INTO tb_badge ( badge_id, badge_name, badge_description, badge_image, badge_xp, chapter_id) VALUES ( 2, 'Rare Quizzer', 'Concluiu 5 Quizzes', 'https://cdn2.iconfinder.com/data/icons/quiz-filloutline/64/TARGET-question_mark-shoot-shooting-question-512.png', 50, 1);
INSERT INTO tb_badge ( badge_id, badge_name, badge_description, badge_image, badge_xp, chapter_id) VALUES ( 3, 'The Explorer 1', 'Concluiu o Capítulo 1', 'https://cdn2.iconfinder.com/data/icons/law-enforcement-soft-fill/60/Police_Badge-shield-police-policing-law-enforcement-512.png', 200, 1);
INSERT INTO tb_badge ( badge_id, badge_name, badge_description, badge_image, badge_xp, chapter_id) VALUES ( 4, 'The Explorer 2', 'Concluiu o Cpítulo 2', 'https://cdn1.iconfinder.com/data/icons/law-28/512/Badge-law-police-security-symbolic-512.png', 200, 2);
INSERT INTO tb_badge ( badge_id, badge_name, badge_description, badge_image, badge_xp, chapter_id) VALUES ( 5, 'Comum Reader', 'Leu 3 Artigos', 'https://cdn1.iconfinder.com/data/icons/detective-2/64/police_badge-badge-police-shield-256.png', 20, 1);
INSERT INTO tb_badge ( badge_id, badge_name, badge_description, badge_image, badge_xp, chapter_id) VALUES ( 6, 'Rare Reader', 'Leu 5 Artigos', 'https://cdn4.iconfinder.com/data/icons/artificial-intelligence-47/64/Book-education-knowledge-learning-ai-512.png', 50, 1);
INSERT INTO tb_badge ( badge_id, badge_name, badge_description, badge_image, badge_xp, chapter_id) VALUES ( 7, 'Epic Reader', 'Leu 10 Artigos', 'https://cdn1.iconfinder.com/data/icons/education-309/64/book-education-knowledge-learning-512.png', 100, 1);
INSERT INTO tb_badge ( badge_id, badge_name, badge_description, badge_image, badge_xp, chapter_id) VALUES ( 8, 'Winged Quizzer', 'Concluiu 1 Quizz em menos de 10 segundos', 'https://cdn3.iconfinder.com/data/icons/rock-and-roll-2/64/celebration-star-wing-events-party-512.png', 70, 1);



INSERT INTO tb_conquest (principal_quest, secondary_quest, chapter_completed, total_badges, total_xp, user_id) VALUES(44, 46, 27, 40, 5950, 1);
INSERT INTO tb_conquest (principal_quest, secondary_quest, chapter_completed, total_badges, total_xp, user_id) VALUES(53, 48, 24, 42, 6345, 2);
INSERT INTO tb_conquest (principal_quest, secondary_quest, chapter_completed, total_badges, total_xp, user_id) VALUES(20, 24, 7, 12, 5223, 3);
INSERT INTO tb_conquest (principal_quest, secondary_quest, chapter_completed, total_badges, total_xp, user_id) VALUES(17, 22, 5, 8, 5180, 4);
INSERT INTO tb_conquest (principal_quest, secondary_quest, chapter_completed, total_badges, total_xp, user_id) VALUES(50, 45, 25, 36, 6790, 5);
INSERT INTO tb_conquest (principal_quest, secondary_quest, chapter_completed, total_badges, total_xp, user_id) VALUES(35, 50, 20, 33, 5910, 6);
INSERT INTO tb_conquest (principal_quest, secondary_quest, chapter_completed, total_badges, total_xp, user_id) VALUES(32, 31, 18, 34, 5780, 7);
INSERT INTO tb_conquest (principal_quest, secondary_quest, chapter_completed, total_badges, total_xp, user_id) VALUES(34, 29, 19, 26, 5775, 8);
INSERT INTO tb_conquest (principal_quest, secondary_quest, chapter_completed, total_badges, total_xp, user_id) VALUES(30, 37, 16, 24, 5590, 9);
INSERT INTO tb_conquest (principal_quest, secondary_quest, chapter_completed, total_badges, total_xp, user_id) VALUES(25, 32, 12, 21, 5570, 10);
INSERT INTO tb_conquest (principal_quest, secondary_quest, chapter_completed, total_badges, total_xp, user_id) VALUES(24, 27, 10, 17, 5440, 11);
INSERT INTO tb_conquest (principal_quest, secondary_quest, chapter_completed, total_badges, total_xp, user_id) VALUES(20, 24, 8, 14, 5250, 12);


