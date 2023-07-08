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

INSERT INTO tb_campaign ( campaign_name, description, image, user_id ) VALUES ('Jogos Digitais', 'Nesta campanha você poderá ter acesso a uma ampla gama de conteúdos relacionados a jogos digitais, esses conteúdos irão abranger não apenas informações sobre o conteúdo ou uma narrativa específica do jogos, mas também diveros detalhes sobre desenvolvimento de jogos, ou seja, a campanha tem como objetivo de unir tanto usuários interessados em criar jogos quanto aqueles que amam jogar.', 'https://media.istockphoto.com/vectors/cloud-gaming-concept-gamepad-connected-to-the-cloud-flat-style-vector-id1165117445?k=20&m=1165117445&s=612x612&w=0&h=aIcTimhml4qZX1mC0P-GfRYaETpqU4Lu-6EwlO6x308=', 1)
INSERT INTO tb_campaign ( campaign_name, description, image, user_id ) VALUES ('Webverso', 'Descrição da Campanha Webverso', 'https://www.carrental-mauritius.com/wp-content/themes/fleet-master/images/Pingouin---home---benefits-FINAL4mobile.png', 2)
INSERT INTO tb_campaign ( campaign_name, description, image, user_id ) VALUES ('Viagens e Exploração', 'Descrição da Campanha Viagens e Exploração', 'https://judyklipin.com/wp-content/uploads/2016/03/life-coaching-1.jpg', 4)
INSERT INTO tb_campaign ( campaign_name, description, image, user_id ) VALUES ('Biomas e Florestas', 'Descrição da Biomas e FLorestas', 'https://static.vecteezy.com/system/resources/previews/001/953/650/large_2x/green-pine-forest-silhouette-background-free-vector.jpg', 1)
INSERT INTO tb_campaign ( campaign_name, description, image, user_id ) VALUES ('Equipes', 'Descrição da Campanha Equipes', 'https://michiganross.umich.edu/sites/default/files/images/articles/shutterstock_596584694.jpg', 1)
INSERT INTO tb_campaign ( campaign_name, description, image, user_id ) VALUES ('Campanha 6', 'Descrição da Campanha 6', 'https://image.freepik.com/free-vector/gradient-geometric-purple-shapes-dark-background_23-2148423872.jpg', 3)
INSERT INTO tb_campaign ( campaign_name, description, image, user_id ) VALUES ('Campanha 7', 'Descrição da Campanha 7', 'https://torobche.com/wp-content/uploads/2021/07/Abstract.Background.25.EPS_.Thmb_.jpg', 2)

INSERT INTO tb_post ( title, summary, body, user_id, post_image) VALUES ( 'O Conceito no Desenvolvimento de Jogos', 'O Conceito no Desenvolvimento de Jogos é o primeiro passo de para que se possa ter um panorama geral sobre a idéia do jogo, e somente está ao fim desta etapa que a premissa será colocada em planejamento.', 'O conceito do jogo representa fase inicial de um longo e complexo processo de desenvolvimento. Esta etapa é caracterizada por lidar com aspectos conceituais, ou seja, envolve uma base de argumentos que irão solidificar a viabilidade do game, devemos compreender que o desenvolvimento de um jogo pode envolver um alto valor de orçamento, tempo e esforço; portanto deve-se ter uma mínima gariantia de que o processo será recompensador. A ideia do game pode ser concebida de diversas formas, seja através de estatísticas sobre os usuários que consomem o tipo de conteúdo, ou mesmo de entrevistas e questionários que buscam informações mais subjetivas.', 1, 'https://phelixinfosolutions.com/blog/wp-content/uploads/2021/06/19870-scaled.jpg');
INSERT INTO tb_post ( title, summary, body, user_id, post_image) VALUES ( 'Planejamento no Desenvolvimento de Jogos Digitais', 'O Planejamento no Desenvolvimento de Jogos é toda a concepção de como o jogo será propriamente produzido, esta etapa só pode ser executada caso a viabilidade do jogo tenha sido aceita na etapa anterior.', 'O Planejamento no Desenvolvimento de Jogos é toda a concepção de como o jogo será propriamente produzido, esta etapa só pode ser executada caso a viabilidade do jogo tenha sido aceita na etapa anterior. O Planejamento no Desenvolvimento de Jogos é toda a concepção de como o jogo será propriamente produzido, esta etapa só pode ser executada caso a viabilidade do jogo tenha sido aceita na etapa anterior. O Planejamento no Desenvolvimento de Jogos é toda a concepção de como o jogo será propriamente produzido, esta etapa só pode ser executada caso a viabilidade do jogo tenha sido aceita na etapa anterior. O Planejamento no Desenvolvimento de Jogos é toda a concepção de como o jogo será propriamente produzido, esta etapa só pode ser executada caso a viabilidade do jogo tenha sido aceita na etapa anterior.', 1, 'https://www.aribilgi.com/wp-content/uploads/2020/10/Network-Ag-Uzmanligi-Sistem.jpg');
INSERT INTO tb_post ( title, summary, body, user_id, post_image) VALUES ( 'A Produção no Desenvolvimento de Jogos Digitais', 'A Produção no Desenvolvimento de Jogos é a construção de tudo aquilo que foi planejado na etapa de planejamento, é a fase com a maior duração de tempo para ser finalizada e também é a mais complexa.', 'A Produção no Desenvolvimento de Jogos é a construção de tudo aquilo que foi planejado na etapa de planejamento, é a fase com a maior duração de tempo para ser finalizada e também é a mais complexa. A Produção no Desenvolvimento de Jogos é a construção de tudo aquilo que foi planejado na etapa de planejamento, é a fase com a maior duração de tempo para ser finalizada e também é a mais complexa. A Produção no Desenvolvimento de Jogos é a construção de tudo aquilo que foi planejado na etapa de planejamento, é a fase com a maior duração de tempo para ser finalizada e também é a mais complexa. A Produção no Desenvolvimento de Jogos é a construção de tudo aquilo que foi planejado na etapa de planejamento, é a fase com a maior duração de tempo para ser finalizada e também é a mais complexa.', 2, 'https://www.digibubble.co.uk/wp-content/uploads/2021/07/marketing-team-cartoon-graphic900x600.png');
INSERT INTO tb_post ( title, summary, body, user_id, post_image) VALUES ( 'Os Testes de Jogos Digitais', 'A fase de Teste durante Desenvolvimento de Jogos é o momento em que toda aquela construção feita na etapa anterior é colocada à prova afim de saber se as funcionalidades esstão de acordo ou ser terão de ser revisionadas, a dificuldade desta fase depende bastante da qualidade das fases anteriores.', 'A fase de Teste durante Desenvolvimento de Jogos é o momento em que toda aquela construção feita na etapa anterior é colocada à prova afim de saber se as funcionalidades esstão de acordo ou ser terão de ser revisionadas, a dificuldade desta fase depende bastante da qualidade das fases anteriores. A fase de Teste durante Desenvolvimento de Jogos é o momento em que toda aquela construção feita na etapa anterior é colocada à prova afim de saber se as funcionalidades esstão de acordo ou ser terão de ser revisionadas, a dificuldade desta fase depende bastante da qualidade das fases anteriores. A fase de Teste durante Desenvolvimento de Jogos é o momento em que toda aquela construção feita na etapa anterior é colocada à prova afim de saber se as funcionalidades esstão de acordo ou ser terão de ser revisionadas, a dificuldade desta fase depende bastante da qualidade das fases anteriores.', 2, 'https://blog.acelerato.com/wp-content/uploads/2019/06/gestao_projetos-1080x567.jpg');
INSERT INTO tb_post ( title, summary, body, user_id, post_image) VALUES ( 'A Implantação de Jogos Digitais', 'A Implantação é a fase que sucede o projeto de Desenvolvimento de um Jogo, nesta fase o jogo é abordado como um produto e será mantido através de atualizações frequentes.', 'A Implantação é a fase que sucede o projeto de Desenvolvimento de um Jogo, nesta fase o jogo é abordado como um produto e será mantido através de atualizações frequentes. A Implantação é a fase que sucede o projeto de Desenvolvimento de um Jogo, nesta fase o jogo é abordado como um produto e será mantido através de atualizações frequentes. A Implantação é a fase que sucede o projeto de Desenvolvimento de um Jogo, nesta fase o jogo é abordado como um produto e será mantido através de atualizações frequentes. A Implantação é a fase que sucede o projeto de Desenvolvimento de um Jogo, nesta fase o jogo é abordado como um produto e será mantido através de atualizações frequentes.', 2, 'https://www.digibubble.co.uk/wp-content/uploads/2021/07/marketing-team-cartoon-graphic900x600.png');

INSERT INTO tb_post ( title, summary, body, user_id, post_image, created_date) VALUES ( 'Postagem 3', 'Um Breve Resumo Sobre a Postagem 3', 'Uma Descrição que Aborda Detalhadamente a Temática Relacionada a Postagem 3.', 3, 'https://blog.acelerato.com/wp-content/uploads/2019/06/gestao_projetos-1080x567.jpg', '2022-03-01');
INSERT INTO tb_post ( title, summary, body, user_id, post_image) VALUES ( 'Postagem 4', 'Um Breve Resumo Sobre a Postagem 4', 'Uma Descrição que Aborda Detalhadamente a Temática Relacionada a Postagem 4.', 4, 'http://milehighhealthalliance.org/wp-content/uploads/2021/03/1-year-1024x534.png');
INSERT INTO tb_post ( title, summary, body, user_id, post_image) VALUES ( 'Postagem 5', 'Um Breve Resumo Sobre a Postagem 5', 'Uma Descrição que Aborda Detalhadamente a Temática Relacionada a Postagem 5.', 4, 'http://sfwallpaper.com/images/blog-wallpaper-3.jpg');
INSERT INTO tb_post ( title, summary, body, user_id, post_image) VALUES ( 'Postagem 6', 'Um Breve Resumo Sobre a Postagem 6', 'Uma Descrição que Aborda Detalhadamente a Temática Relacionada a Postagem 6.', 1, 'https://blog.acelerato.com/wp-content/uploads/2019/06/gestao_projetos-1080x567.jpg');
INSERT INTO tb_post ( title, summary, body, user_id, post_image) VALUES ( 'Postagem 7', 'Um Breve Resumo Sobre a Postagem 7', 'Uma Descrição que Aborda Detalhadamente a Temática Relacionada a Postagem 7.', 2, 'http://milehighhealthalliance.org/wp-content/uploads/2021/03/1-year-1024x534.png');
INSERT INTO tb_post ( title, summary, body, user_id, post_image) VALUES ( 'Postagem 8', 'Um Breve Resumo Sobre a Postagem 8', 'Uma Descrição que Aborda Detalhadamente a Temática Relacionada a Postagem 8', 3, 'http://sfwallpaper.com/images/blog-wallpaper-3.jpg');
INSERT INTO tb_post ( title, summary, body, user_id, post_image) VALUES ( 'Postagem 9', 'Um Breve Resumo Sobre a Postagem 9', 'Uma Descrição que Aborda Detalhadamente a Temática Relacionada a Postagem 9.', 4, 'http://sfwallpaper.com/images/blog-wallpaper-3.jpg');
INSERT INTO tb_post ( title, summary, body, user_id, post_image) VALUES ( 'Postagem 10', 'Um Breve Resumo Sobre a Postagem 10', 'Uma Descrição que Aborda Detalhadamente a Temática Relacionada a Postagem 10.', 5, 'https://www.aribilgi.com/wp-content/uploads/2020/10/Network-Ag-Uzmanligi-Sistem.jpg');
INSERT INTO tb_post ( title, summary, body, user_id, post_image) VALUES ( 'Postagem 11', 'Um Breve Resumo Sobre a Postagem 11', 'Uma Descrição que Aborda Detalhadamente a Temática Relacionada a Postagem 11.', 1, 'http://sfwallpaper.com/images/blog-wallpaper-3.jpg');
INSERT INTO tb_post ( title, summary, body, user_id, post_image) VALUES ( 'Postagem 12', 'Um Breve Resumo Sobre a Postagem 12', 'Uma Descrição que Aborda Detalhadamente a Temática Relacionada a Postagem 12.', 7, 'https://www.digibubble.co.uk/wp-content/uploads/2021/07/marketing-team-cartoon-graphic900x600.png');
INSERT INTO tb_post ( title, summary, body, user_id, post_image) VALUES ( 'Postagem 13', 'Um Breve Resumo Sobre a Postagem 13', 'Uma Descrição que Aborda Detalhadamente a Temática Relacionada a Postagem 13.', 3, 'http://sfwallpaper.com/images/blog-wallpaper-3.jpg');
INSERT INTO tb_post ( title, summary, body, user_id, post_image) VALUES ( 'Postagem 14', 'Um Breve Resumo Sobre a Postagem 14', 'Uma Descrição que Aborda Detalhadamente a Temática Relacionada a Postagem 14.', 6, 'https://www.aribilgi.com/wp-content/uploads/2020/10/Network-Ag-Uzmanligi-Sistem.jpg');
INSERT INTO tb_post ( title, summary, body, user_id, post_image) VALUES ( 'Postagem 15', 'Um Breve Resumo Sobre a Postagem 15', 'Uma Descrição que Aborda Detalhadamente a Temática Relacionada a Postagem 15.', 4, 'https://blog.acelerato.com/wp-content/uploads/2019/06/gestao_projetos-1080x567.jpg');

INSERT INTO tb_comment ( body, created_date, post_id, user_id ) VALUES ( 'Concordo, todavia discordo.', now (), 1, 2 );
INSERT INTO tb_comment ( body, created_date, post_id, user_id ) VALUES ( 'Como eu faço pra acessar a câmera frontal do dispositivo de outra pessoa ?', now (), 2, 1 );
INSERT INTO tb_comment ( body, created_date, post_id, user_id ) VALUES ( 'Eu investiguei e esta informação está errada!', now (), 2, 3 );
INSERT INTO tb_comment ( body, created_date, post_id, user_id ) VALUES ( 'Como eu imprimo um vídeo ?', now (), 3, 4 );

INSERT INTO tb_chapter ( campaign_id, chapter_title, chapter_description, chapter_image) VALUES ( 1, 'Conceito no Desenvolvimento de Jogos Digitais', 'Neste capítulo você será apresentado a diversos desafios e atividades que irão testar os seus conhecimentos a cerca da etapa de conceito no desenvolvimento de jogos, para  executar este capítulo com êxito é nescessário compreender as metodologias, os requisitos e os processos usados nesta fase.', 'https://wallpapercave.com/wp/wp7664856.png');
INSERT INTO tb_chapter ( campaign_id, chapter_title, chapter_description, chapter_image) VALUES ( 1, 'Planejamento no Desenvolvimento de Jogos Digitais', 'Neste capítulo você será apresentado a diversos desafios e atividades que irão testar os seus conhecimentos a cerca da etapa de planejamento no desenvolvimento de jogos, para  executar este capítulo com êxito é nescessário compreender as metodologias, os requisitos e os processos usados nesta fase.', 'https://helpitech.com.br/img-elementos/suporte-de-TI.jpg');
INSERT INTO tb_chapter ( campaign_id, chapter_title, chapter_description, chapter_image) VALUES ( 1, 'A Fase de Produção no Desenvolvimento de Jogos Digitais', 'Neste capítulo você será apresentado a diversos desafios e atividades que irão testar os seus conhecimentos a cerca da etapa de produção no desenvolvimento de jogos, para  executar este capítulo com êxito é nescessário compreender as metodologias, os requisitos e os processos usados nesta fase.', 'https://banthe247.com/pictures/images/nap-the-gate-cho-garena4.jpg');
INSERT INTO tb_chapter ( campaign_id, chapter_title, chapter_description, chapter_image) VALUES ( 1, 'A Etapa de Testes nos Jogos Digitais', 'Neste capítulo você será apresentado a diversos desafios e atividades que irão testar os seus conhecimentos a cerca da etapa de testes no desenvolvimento de jogos, para  executar este capítulo com êxito é nescessário compreender as metodologias, os requisitos e os processos usados nesta fase.', 'https://sistemasgeniales.com/wp-content/uploads/2020/10/UI-768x432.jpg');
INSERT INTO tb_chapter ( campaign_id, chapter_title, chapter_description, chapter_image) VALUES ( 1, 'A Implantação de Jogos Digitais', 'Neste capítulo você será apresentado a diversos desafios e atividades que irão testar os seus conhecimentos a cerca da etapa de implantação no desenvolvimento de jogos, para  executar este capítulo com êxito é nescessário compreender as metodologias, os requisitos e os processos usados nesta fase.', 'https://mpowr.com/wp-content/uploads/2020/11/Nonprofit-Technology-MPOWR.jpg');

INSERT INTO tb_quiz ( title, description, image, chapter_id) VALUES ( 'Formularizando a ideia no Desenvolvimento de Jogos', 'A fase de conceito no desenvolvimento de jogos é o ponto inicial das atividades. Teste os seus conhecimentos sobre esta etapa neste quizz!', 'https://1.bp.blogspot.com/-xGw8Rcwupvw/XoXsp5j7pMI/AAAAAAAAAds/NckNhfigjFIeFB_BgezgUcJd_-K3FNsCgCLcBGAsYHQ/s1600/best-game-development-interview-questions.png', 1);
INSERT INTO tb_quiz ( title, description, image, chapter_id) VALUES ( 'Organização dos Requisitos para o Conceito de um Jogo', 'Quiz sobre a fase de planenejamento no desenvolvimento de jogos', 'https://www.dekoder.org/sites/default/files/hacker_1.png', 1);
INSERT INTO tb_quiz ( title, description, image, chapter_id) VALUES ( 'Avaliando os Risco no Desenvolvimento de um Game', 'Quiz sobre a fase de produção no desenvolvimento de jogos', 'https://img.wonderhowto.com/img/20/66/63724953674051/0/expand-your-coding-skill-set-by-learning-build-games-unity.w1456.jpg', 1);
INSERT INTO tb_quiz ( title, description, image, chapter_id) VALUES ( 'A Estrutura de uma Equipe no Desenvolvimento de Jogos', 'Quiz sobre a fase de testes no desenvolvimento de jogos', 'https://www.dekoder.org/sites/default/files/hacker_1.png', 1);
INSERT INTO tb_quiz ( title, description, image, chapter_id) VALUES ( 'Os Recursos no Desenvolvimento de Jogos', 'Quiz sobre a fase de implantação no desenvolvimento de jogos', 'https://img.wonderhowto.com/img/20/66/63724953674051/0/expand-your-coding-skill-set-by-learning-build-games-unity.w1456.jpg', 1);

INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES (1, 'Qual das opções não representa uma forma de alcançar a viabilidade de uma ideia ?', 1);
INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES (1, 'O que fazer caso uma ideia crie dois caminhos divergntes, mas ambos ainda se aplicam ao conceito do jogo ?', 2);
INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES (1, 'Como manter um escopo coerente em uma ideia ?', 3);
INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES (2, 'Questão 1 sobre Organicação dos Requisitos ', 4);
INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES (2, 'Questão 2 sobre Organicação dos Requisitos ', 1);
INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES (2, 'Questão 3 sobre Organicação dos Requisitos ', 5);
INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES (3, 'Questão 1 sobre Avaliação de Riscos', 1 );
INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES (3, 'Questão 2 sobre Avaliação de Riscos', 4);
INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES (3, 'Questão 3 sobre Avaliação de Riscos', 3);
INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES (4, 'Questão 1 sobre Estrutura da Equipe', 2);
INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES (4, 'Questão 2 sobre Estrutura da Equipe', 5);
INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES (4, 'Questão 3 sobre Estrutura da Equipe', 3 );
INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES (5, 'Questão 1 sobre Recursos no Desenvolvimento de Jogos', 1);
INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES (5, 'Questão 2 sobre Recursos no Desenvolvimento de Jogos', 2);
INSERT INTO tb_question ( quiz_id, question_title, correct_choice ) VALUES (5, 'Questão 3 sobre Recursos no Desenvolvimento de Jogos', 1);

INSERT INTO tb_option (question_id, choice) VALUES(1, 'Relacionar a ideia com um histórico de ideias com o mesmo conceito')
INSERT INTO tb_option (question_id, choice) VALUES(1, 'Criar pontos de referência para ver o progresso da ideia')
INSERT INTO tb_option (question_id, choice) VALUES(1, 'Receber o feedback de pessoas que se identificam com a ideia')
INSERT INTO tb_option (question_id, choice) VALUES(1, 'Ignorar os erros afim de manter a ideia em progresso contínuo')
INSERT INTO tb_option (question_id, choice) VALUES(1, 'Registrar e reavaliar os aspectos da ideia')
INSERT INTO tb_option (question_id, choice) VALUES(2, 'Opção A')
INSERT INTO tb_option (question_id, choice) VALUES(2, 'Opção B')
INSERT INTO tb_option (question_id, choice) VALUES(2, 'Opção C')
INSERT INTO tb_option (question_id, choice) VALUES(3, 'Opção A')
INSERT INTO tb_option (question_id, choice) VALUES(3, 'Opção B')
INSERT INTO tb_option (question_id, choice) VALUES(3, 'Opção C')
INSERT INTO tb_option (question_id, choice) VALUES(4, 'Opção A')
INSERT INTO tb_option (question_id, choice) VALUES(4, 'Opção B')
INSERT INTO tb_option (question_id, choice) VALUES(4, 'Opção C')
INSERT INTO tb_option (question_id, choice) VALUES(5, 'Opção A')
INSERT INTO tb_option (question_id, choice) VALUES(5, 'Opção B')
INSERT INTO tb_option (question_id, choice) VALUES(5, 'Opção C')

INSERT INTO tb_badge (badge_name, badge_description, badge_image, badge_xp) VALUES ( 'Comum Quizzer', 'Concluiu 1 Quiz em uma Campanha', 'https://cdn2.iconfinder.com/data/icons/quiz-filloutline/64/MEDAL-question_mark-exam-reward-winner-question-512.png', 20);
INSERT INTO tb_badge (badge_name, badge_description, badge_image, badge_xp) VALUES ( 'Rare Quizzer', 'Concluiu Metade dos Quizzes de uma Campanha', 'https://cdn2.iconfinder.com/data/icons/quiz-filloutline/64/TARGET-question_mark-shoot-shooting-question-512.png', 50);
INSERT INTO tb_badge (badge_name, badge_description, badge_image, badge_xp) VALUES ( 'The Explorer 1', 'Concluiu Metade dos Capítulos de uma Campanha', 'https://cdn2.iconfinder.com/data/icons/law-enforcement-soft-fill/60/Police_Badge-shield-police-policing-law-enforcement-512.png', 200);
INSERT INTO tb_badge (badge_name, badge_description, badge_image, badge_xp) VALUES ( 'The Explorer 2', 'Concluiu Todos os Capítulos de uma Campanha', 'https://cdn1.iconfinder.com/data/icons/law-28/512/Badge-law-police-security-symbolic-512.png', 200);
INSERT INTO tb_badge (badge_name, badge_description, badge_image, badge_xp) VALUES ( 'Comum Reader', 'Leu 1 Artigo de uma Campanha', 'https://cdn1.iconfinder.com/data/icons/detective-2/64/police_badge-badge-police-shield-256.png', 20);
INSERT INTO tb_badge (badge_name, badge_description, badge_image, badge_xp) VALUES ( 'Rare Reader', 'Leu Metade dos Artigos de uma Campanha', 'https://cdn4.iconfinder.com/data/icons/artificial-intelligence-47/64/Book-education-knowledge-learning-ai-512.png', 50);
INSERT INTO tb_badge (badge_name, badge_description, badge_image, badge_xp) VALUES ( 'Epic Reader', 'Leu Toods os Artigos de uma Campanha', 'https://cdn1.iconfinder.com/data/icons/education-309/64/book-education-knowledge-learning-512.png', 100);
INSERT INTO tb_badge (badge_name, badge_description, badge_image, badge_xp) VALUES ( 'Winged Quizzer', 'Concluiu 1 Quizz em menos de 10 segundos', 'https://cdn3.iconfinder.com/data/icons/rock-and-roll-2/64/celebration-star-wing-events-party-512.png', 70);

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

INSERT INTO tb_user_post (post_id, user_id) VALUES (3, 1);
INSERT INTO tb_user_post (post_id, user_id) VALUES (4, 1);
INSERT INTO tb_user_post (post_id, user_id) VALUES (5, 1);
INSERT INTO tb_user_post (post_id, user_id) VALUES (6, 1);

INSERT INTO tb_follow (following, follower) VALUES (1, 3);
INSERT INTO tb_follow (following, follower) VALUES (1, 5);
INSERT INTO tb_follow (following, follower) VALUES (1, 7);
INSERT INTO tb_follow (following, follower) VALUES (2, 4);
INSERT INTO tb_follow (following, follower) VALUES (2, 6);
INSERT INTO tb_follow (following, follower) VALUES (2, 8);
INSERT INTO tb_follow (following, follower) VALUES (3, 1);
INSERT INTO tb_follow (following, follower) VALUES (4, 1);
INSERT INTO tb_follow (following, follower) VALUES (7, 1);
INSERT INTO tb_follow (following, follower) VALUES (10, 1);

INSERT INTO tb_campaign_badge (badge_id, campaign_id) VALUES (3, 1);
INSERT INTO tb_campaign_badge (badge_id, campaign_id) VALUES (4, 1);
INSERT INTO tb_campaign_badge (badge_id, campaign_id) VALUES (5, 1);
INSERT INTO tb_campaign_badge (badge_id, campaign_id) VALUES (6, 1);

INSERT INTO tb_campaign_user (user_id, campaign_id) VALUES (1, 1);
INSERT INTO tb_campaign_user (user_id, campaign_id) VALUES (1, 3);
INSERT INTO tb_campaign_user (user_id, campaign_id) VALUES (1, 7);
INSERT INTO tb_campaign_user (user_id, campaign_id) VALUES (4, 1);
INSERT INTO tb_campaign_user (user_id, campaign_id) VALUES (6, 1);
INSERT INTO tb_campaign_user (user_id, campaign_id) VALUES (7, 1);

INSERT INTO tb_campaign_post (post_id, campaign_id) VALUES (1, 1);
INSERT INTO tb_campaign_post (post_id, campaign_id) VALUES (2, 1);
INSERT INTO tb_campaign_post (post_id, campaign_id) VALUES (3, 1);
INSERT INTO tb_campaign_post (post_id, campaign_id) VALUES (4, 1);
INSERT INTO tb_campaign_post (post_id, campaign_id) VALUES (5, 1);

INSERT INTO tb_user_badge (badge_id, user_id) VALUES (1, 1);
INSERT INTO tb_user_badge (badge_id, user_id) VALUES (2, 1);
INSERT INTO tb_user_badge (badge_id, user_id) VALUES (3, 1);
INSERT INTO tb_user_badge (badge_id, user_id) VALUES (4, 1);
INSERT INTO tb_user_badge (badge_id, user_id) VALUES (5, 1);
INSERT INTO tb_user_badge (badge_id, user_id) VALUES (6, 1);

