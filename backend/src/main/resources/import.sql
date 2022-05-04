INSERT INTO tb_user (user_id, email, user_name, password, user_image) VALUES (1, 'jack@gmail.com', 'Jack', 'jack123', 'https://cdn4.iconfinder.com/data/icons/diversity-v2-0-volume-02/64/bandit-asian-male-cowboy-512.png');
INSERT INTO tb_user (user_id, email, user_name, password, user_image) VALUES (2, 'ryan@gmail.com', 'Ryan', 'ryan123', 'https://cdn4.iconfinder.com/data/icons/diversity-v2-0-volume-05/64/rastafarian-male-formal-512.png');
INSERT INTO tb_user (user_id, email, user_name, password, user_image) VALUES (3, 'francis@gmail.com', 'Francis', 'francis123', 'https://cdn4.iconfinder.com/data/icons/diversity-v2-0-volume-05/64/emo-asian-female-512.png');
INSERT INTO tb_user (user_id, email, user_name, password, user_image) VALUES (4, 'Anny@gmail.com', 'Anny', 'Anny123', 'https://cdn4.iconfinder.com/data/icons/diversity-v2-0-volume-05/64/emo-black-female-512.png');

INSERT INTO tb_post ( title, summary, views, body, user_id, post_image, created_by, created_date) VALUES ( 'Princípios básicos da Segurança da Informação', '"Porque é importante criar esforço para seguir e manter os quatro princípios da Segurança da Informação"', 0, '<p>É imprescindível que as empresas protejam os dados dos seus clientes com todo o afinco que puderem. Na era digital, os dados são tão importantes que milhares de ataques acontecem diariamente. O Brasil se tornou o segundo maior alvo mundial de ciberataques, segundo um estudo da Netscout. Por isso, as empresas devem sempre se preocupar em gerenciar riscos e proteger as informações de acesso não autorizado, vazamentos, alterações, invasões e perdas. As ameaças à segurança da informação podem acontecer de diversas formas, desde ataques ransomwares a erros humanos. Dessa forma, a segurança da informação se baseia em quatro pilares para proteger as informações e dados: confidencialidade, integridade, disponibilidade e autenticidade.</p>', 1, 'http://sfwallpaper.com/images/blog-wallpaper-3.jpg', 'Big Hunt', now ());
INSERT INTO tb_post ( title, summary, views, body, user_id, post_image, created_by, created_date) VALUES ( 'Confidencialidade e integridade', '"O quão importante é manter de sigílo e inalteração nos dados através dos princípios da Segurança da Informação ?"', 0, '<p>A confidencialidade é o primeiro princípio da segurança da informação por um motivo bem simples: ele lida com a privacidade dos dados, que é fundamental para qualquer empresa que deseja garantir a segurança. Esse conceito diz respeito às ações tomadas para assegurar que as informações não sejam roubadas dos sistemas através de ciberataques, espionagem, acesso não autorizado, entre outras práticas. É pensando na confidencialidade que diversas ações preventivas podem ser tomadas, como por exemplo utilizar programas de Bug Bounty para manter os sistemas seguros, e assim proteger a confidencialidade.</p> <p>O princípio da integridade assegura que os dados mantenham suas características originais, ou seja, não sejam alterados indevidamente. Existe perda da integridade quando uma informação é modificada ou violada impropriamente. Por exemplo, se um funcionário alterar uma informação para simular um preço mais alto que o real, está corrompendo o princípio da integridade.</p>', 2, 'http://sfwallpaper.com/images/blog-wallpaper-3.jpg', 'Big Hunt', now () );
INSERT INTO tb_post ( title, summary, views, body, user_id, post_image, created_by, created_date) VALUES ( 'Autencidade e Disponibilidade', '"Os limites na autoridade para um usuário acessar informações e o quanto o acesso a esta informação estará disponível"', 0, '<p>O princípio da autenticidade garante que as informações sejam provenientes de uma fonte confiável. Em outras palavras, confirma que os dados possuem legitimidade, não havendo manipulação ou intervenções externas, como terceiros se passando por colaboradores.</p> <p>A autenticidade é o pilar que valida a autorização do usuário para acessar, transmitir e receber informações, como logins, senhas ou até autenticações biométricas. Um sistema autêntico confirma a identidade dos usuários antes de liberar o acesso.</p> <p>Para que um sistema de informação seja útil, é indispensável que seus dados estejam disponíveis quando necessário. Portanto, a disponibilidade é outro dos quatro princípios da segurança da informação, que garante o acesso em tempo integral para usuários finais.</p> <p>Para fazer isso, você precisa garantir a estabilidade e acesso permanente às informações dos sistemas por meio de processos de manutenção rápida, eliminação de falhas de software, atualizações contínuas e planos de gerenciamento de crises. Os sistemas são vulneráveis a desastres naturais, ataques, falta de energia e diversas outras ameaças à disponibilidade. Manter os sistemas seguros também significa garantir o máximo possível de segurança para que os dados estejam sempre disponíveis.</p>', 3, 'http://sfwallpaper.com/images/blog-wallpaper-3.jpg', 'Big Hunt', now () );
INSERT INTO tb_post ( title, summary, views, body, user_id, post_image, created_by, created_date) VALUES ( 'Como classificar um Hacker ? - Parte 1', '"O termo hacker é muitas vezes usado como sinónimo de alguém que possui um alto conhecimento em manipulação de código, mas cada um destes indivíduos possuem motivações e princípios diferentes que a qual usuários mais leigos precisam saber para entender com quem podem estar lidando."', 0, '<p>White Hat (Hacker Ético / Chapéu branco) – São hackers que estudam sistemas de computação e redes há procura de falhas na segurança, respeitando sempre os princípios da sua ética. Quando encontram algum tipo de falhas na segurança, reportam aos responsáveis das empresas (bancos, governo, empresas comerciais) para que estes possam tomar as devidas medidas de segurança. Muitos deles aumentam as suas capacidades através de estudos e passam a exercer profissões de professores de informática ou técnicos de rede e computação; Black Hat (Chapéu preto) – São também conhecido como Dark-Side Hacker (hacker do lado negro), são aqueles que não respeitam os códigos de ética da comunidade em que se inserem. São eles que têm contribuído para denegrir a imagem dos hackers, pois utilizam os seus conhecimentos para a prática de crimes através da internet (roubo de dados e informações secretas das empresas); Grey Hat (Chapéu cinzento) – São tipos de hackers que estão entre os white hat e os black hat e que invadem sistemas apenas por diversão, no entanto não mexem nem divulgam dados interditos ou confidenciais. Muitas vezes atuam em troco de dinheiro, ou seja, exploram as vulnerabilidades do sistema de uma determinada empresa, e caso encontrem alguma, oferecem-se para a resolver a troco de dinheiro; Blue Hat (Hacker Empresarial / Chapéu azul) – São hackers contratados por diversas empresas, para testar os sistemas de segurança antes que os mesmos sejam liberados. Estes tentam encontrar quebras nos sistemas para que as mesmas possam ser resolvidas; Crackers – São motivados pela conquista de conhecimento das técnicas, pela popularidade e pelo respeito que adquirem quando criam um keygen ou um crack. Eles empenham-se em perceber como o software é desenvolvido e como atua num sistema operacional para que possam falsificá-lo. No entanto os crakings são feitos de forma ilegal e sem se enquadrarem nos códigos de ética. Este termo foi criado em 1985 por hackers revoltados contra o roubo e vandalismo informático que é muitas vezes praticado pelos Crackers; Newbie (Novato) – É o nome dado a um principiante no mundo/comunidade hacker; Phreakers (Malucos) – Estes tipos de hacker são especialista em linhas telefónicas (móveis ou fixas). Embora antigamente fosse bastante fácil enganar um sistema de telefone, no entanto hoje em dia são poucos os que dominam esta arte devido à complexidade de segurança que as empresas de telecomunicações têm. Scripts Kiddies/lamer (Rapaz do script) – são hackers pouco competentes e que usam ferramentas já criadas por outras pessoas, no entanto não têm conhecimento do sistema nas suas atividades; Hacktivistas (Hacker ativista) – Termo que surge das palavras “hacker” e “ativista” e denomina hackers que manipulam códigos para promover a expressão política, liberdade de expressão, direitos humanos e ética através de computadores. Arackers (hackers de araque) – São a grande maioria dos hackers. Basicamente são pessoas que fingem ser os melhores e os mais espertos, no entanto não passam apenas de pessoas que fazem downloads do mais variado estilo ou que apenas jogam na internet jogos como “First Person Kill” ou “Killerware”. São conhecidos também como “odonto-hackers” – hackers da boca para fora. Elite – Esta é sem dúvida a minoria dos hackers. São os hackers mais respeitados e conceituados do mundo. Por norma esta posição é atingida quando se encontram em grupos de grande visibilidade ou quando desenvolvem um código completamente inovador.</p>', 4, 'http://sfwallpaper.com/images/blog-wallpaper-3.jpg', 'Filipa Cardoso', now () );


INSERT INTO tb_comment( body, created_date, post_id, user_id ) VALUES ( 'Concordo, todavia discordo.', now (), 1, 2 );
INSERT INTO tb_comment( body, created_date, post_id, user_id ) VALUES ( 'Como eu faço pra acessar a câmera frontal do dispositivo de outra pessoa ?', now (), 2, 1 );
INSERT INTO tb_comment( body, created_date, post_id, user_id ) VALUES ( 'Eu investiguei e esta informação está errada!', now (), 2, 3 );
INSERT INTO tb_comment( body, created_date, post_id, user_id ) VALUES ( 'Como eu imprimo um vídeo ?', now (), 3, 4 );

INSERT INTO tb_question ( question_id,  question_title, option_a, option_b, option_c, option_d, option_e, ans, chose ) VALUES ( 1, 'Quais os princípios básicos da Segurança da Informação ?', 'Confidencialidade, integridade, disponibilidade, autencidade', 'Confidencialidade, não repúdio, disponibliidade, concistência', 'Escalabilidade, integridade, autenticiadade, criptografia', 'Durabilidade, integridade, tolerância, encapsulamento', 'Confidencialidade, disponibilidade, autencidade', 1, -1);
INSERT INTO tb_question ( question_id,  question_title, option_a, option_b, option_c, option_d, option_e, ans, chose ) VALUES ( 2,  'Qual atributo corresponde ao nível de sigilo de uma informação ?', 'Criptografia', 'Confidencialidade', 'Privacidade', 'Isolamento', 'Todas as alternativas estão corretas', 2, -1);
INSERT INTO tb_question ( question_id,  question_title, option_a, option_b, option_c, option_d, option_e, ans, chose ) VALUES ( 6,  'Quem tem acesso a informações privilegiadas de uma determinada empresa é chamado de: ', 'Black Hat', 'Hackvista', 'Elite', 'Blue Hat', 'Insider', 5, -1);
INSERT INTO tb_question ( question_id,  question_title, option_a, option_b, option_c, option_d, option_e, ans, chose ) VALUES ( 3,  'Dados importantes em que a condição de inalteravél deve durar o máximo possível, este princípio trata-se de:', 'Autenticidade', 'Durabilidade', 'Disponibilidade', 'Particionamento', 'Integridade', 3, -1);
INSERT INTO tb_question ( question_id,  question_title, option_a, option_b, option_c, option_d, option_e, ans, chose ) VALUES ( 4,  'Qual indivíduo é responsável por um ataque autorizado com intenções justas ?', 'Cracker', 'Hackvista', 'Grey Hat', 'Hacker ético', 'Insider', 4, -1);
INSERT INTO tb_question ( question_id,  question_title, option_a, option_b, option_c, option_d, option_e, ans, chose ) VALUES ( 5,  'Invadir sistemas sem autorização, manipular códigos e coletar dados sigilosos em prol de causas sociais, éticas ou morais. Essas características referem-se ao:', 'Hackvista', 'Newbie', 'Hacker ético', 'Grey Hat', 'Phreakers', 1, -1);

INSERT INTO tb_chapter ( chapter_title, chapter_description, chapter_image) VALUES ( '"Princípios Básicos da Segurança da Informação"', '<p>Neste capítulo você será apresentado a missões que iram testar os seus conhecimentos a cerca dos princípios básicos da segurança da informação, para  executar este capítulo com êxito é nescessário compreender as características de cada um dos príncipios.</p>', 'https://makewebbetter.com/wp-content/uploads/2017/12/mainbanner1-1-1.jpg');
INSERT INTO tb_chapter ( chapter_title, chapter_description, chapter_image) VALUES ( '"Os Tipos de Hackers"', '<p>Este capítulo será dedicado aos indivíduos que possuem uma facilidade e um conhecimento elevado em torno da manipulação código que permite o acesso a informações consideradas sigilosas, apesar que serem nomeados generalizadamente como Hackers há diferenças entre cada um deles que se dá por questões de índole ou nível de conhecimento e neste capítulos você deverá conhecer cada um deles.</p>', 'https://avante.biz/wp-content/uploads/Cool-Hacker-Wallpapers/Cool-Hacker-Wallpapers-014.jpg');

INSERT INTO tb_badge ( badge_id, badge_name, badge_description, badge_image, badge_xp, chapter_id, user_id) VALUES ( 1, 'Comum Quizzer', 'Concluiu 3 Quizzes', 'https://cdn2.iconfinder.com/data/icons/quiz-filloutline/64/MEDAL-question_mark-exam-reward-winner-question-512.png', 20, 1, 1);
INSERT INTO tb_badge ( badge_id, badge_name, badge_description, badge_image, badge_xp, chapter_id, user_id) VALUES ( 2, 'Rare Quizzer', 'Concluiu 5 Quizzes', 'https://cdn2.iconfinder.com/data/icons/quiz-filloutline/64/TARGET-question_mark-shoot-shooting-question-512.png', 50, 1, 1);
INSERT INTO tb_badge ( badge_id, badge_name, badge_description, badge_image, badge_xp, chapter_id, user_id) VALUES ( 3, 'The Explorer 1', 'Concluiu o Capítulo 1', 'https://cdn2.iconfinder.com/data/icons/law-enforcement-soft-fill/60/Police_Badge-shield-police-policing-law-enforcement-512.png', 200, 1, 1);
INSERT INTO tb_badge ( badge_id, badge_name, badge_description, badge_image, badge_xp, chapter_id, user_id) VALUES ( 4, 'The Explorer 2', 'Concluiu o Cpítulo 2', 'https://cdn1.iconfinder.com/data/icons/law-28/512/Badge-law-police-security-symbolic-512.png', 200, 2, 1);
INSERT INTO tb_badge ( badge_id, badge_name, badge_description, badge_image, badge_xp, chapter_id, user_id) VALUES ( 5, 'Comum Reader', 'Leu 3 Artigos', 'https://cdn1.iconfinder.com/data/icons/detective-2/64/police_badge-badge-police-shield-256.png', 20, 1, 1);
INSERT INTO tb_badge ( badge_id, badge_name, badge_description, badge_image, badge_xp, chapter_id, user_id) VALUES ( 6, 'Rare Reader', 'Leu 5 Artigos', 'https://cdn4.iconfinder.com/data/icons/artificial-intelligence-47/64/Book-education-knowledge-learning-ai-512.png', 50, 1, 1);
INSERT INTO tb_badge ( badge_id, badge_name, badge_description, badge_image, badge_xp, chapter_id, user_id) VALUES ( 7, 'Epic Reader', 'Leu 10 Artigos', 'https://cdn1.iconfinder.com/data/icons/education-309/64/book-education-knowledge-learning-512.png', 100, 1, 1);
INSERT INTO tb_badge ( badge_id, badge_name, badge_description, badge_image, badge_xp, chapter_id, user_id) VALUES ( 8, 'Winged Quizzer', 'Concluiu 1 Quizz em menos de 10 segundos', 'https://cdn3.iconfinder.com/data/icons/rock-and-roll-2/64/celebration-star-wing-events-party-512.png', 70, 1, 1);

INSERT INTO tb_result ( total_correct, user_id) VALUES( 3, 1 );
INSERT INTO tb_result ( total_correct, user_id) VALUES( 2, 2 );
INSERT INTO tb_result ( total_correct, user_id) VALUES( 0, 3 );

INSERT INTO tb_conquest (article_read, chapter_completed, quizz_completed, total_badges, total_xp, user_id) VALUES( 5, 2, 6, 4, 540, 1);
INSERT INTO tb_conquest ( article_read, chapter_completed, quizz_completed, total_badges, total_xp, user_id ) VALUES(3, 1, 4, 2, 220, 2);
INSERT INTO tb_conquest ( article_read, chapter_completed, quizz_completed, total_badges, total_xp, user_id ) VALUES(5, 1, 5, 3, 370, 3);
INSERT INTO tb_conquest ( article_read, chapter_completed, quizz_completed, total_badges, total_xp, user_id ) VALUES(4, 0, 4, 1, 150, 4);


