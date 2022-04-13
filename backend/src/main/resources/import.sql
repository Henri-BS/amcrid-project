INSERT INTO tb_user
(
   user_id,
   email,
   user_name,
   password,
   user_image
)
VALUES
(
   1,
   'jack@gmail.com',
   'Jack',
   'jack123',
   'https://cdn4.iconfinder.com/data/icons/diversity-v2-0-volume-02/64/bandit-asian-male-cowboy-512.png'
);
INSERT INTO tb_user
(
   user_id,
   email,
   user_name,
   password,
   user_image
)
VALUES
(
   2,
   'ryan@gmail.com',
   'Ryan',
   'ryan123',
   'https://cdn4.iconfinder.com/data/icons/diversity-v2-0-volume-05/64/rastafarian-male-formal-512.png'
);
INSERT INTO tb_user
(
   user_id,
   email,
   user_name,
   password,
   user_image
)
VALUES
(
   3,
   'francis@gmail.com',
   'Francis',
   'francis123',
   'https://cdn4.iconfinder.com/data/icons/diversity-v2-0-volume-05/64/emo-asian-female-512.png'
);
INSERT INTO tb_user
(
   user_id,
   email,
   user_name,
   password,
   user_image
)
VALUES
(
   4,
   'Anny@gmail.com',
   'Anny',
   'Anny123',
   'https://cdn4.iconfinder.com/data/icons/diversity-v2-0-volume-05/64/emo-black-female-512.png'
);



INSERT INTO tb_post
(
   title,
   summary,
   views,
   body,
   user_id,
   post_image,
   created_by,
   created_date,
   last_modified_by,
   last_modified_date
)
VALUES
(
   'Princípios básicos da Segurança da Informação',
   '"Porque é important criar esforço para seguir e manter os quatro princípios da Segurança da Informação e como eles ifluenciam na segurança e privacidade nos meios digitais e na vida real ?"',
   0,
   '<p>É imprescindível que as empresas protejam os dados dos seus clientes com todo o afinco que puderem. Na era digital, os dados são tão importantes que milhares de ataques acontecem diariamente. O Brasil se tornou o segundo maior alvo mundial de ciberataques, segundo um estudo da Netscout. Por isso, as empresas devem sempre se preocupar em gerenciar riscos e proteger as informações de acesso não autorizado, vazamentos, alterações, invasões e perdas.</p> <p> As ameaças à segurança da informação podem acontecer de diversas formas, desde ataques ransomwares a erros humanos. Dessa forma, a segurança da informação se baseia em quatro pilares para proteger as informações e dados: confidencialidade, integridade, disponibilidade e autenticidade.</p>',
   1,
   'http://sfwallpaper.com/images/blog-wallpaper-3.jpg',
   'Moderation',
   now (),
   'Jack',
   now ()
);
INSERT INTO tb_post
(
   title,
   summary,
   views,
   body,
   user_id,
   post_image,
   created_by,
   created_date,
   last_modified_by,
   last_modified_date
)
VALUES
(
   'Confidencialidade e integridade',
   '"O quão importante é manter de sigílo e inalteração nos dados através dos princípios da Segurança da Informação ?"',
   0,
   '<p>A confidencialidade é o primeiro princípio da segurança da informação por um motivo bem simples: ele lida com a privacidade dos dados, que é fundamental para qualquer empresa que deseja garantir a segurança. Esse conceito diz respeito às ações tomadas para assegurar que as informações não sejam roubadas dos sistemas através de ciberataques, espionagem, acesso não autorizado, entre outras práticas. É pensando na confidencialidade que diversas ações preventivas podem ser tomadas, como por exemplo utilizar programas de Bug Bounty para manter os sistemas seguros, e assim proteger a confidencialidade.</p> <p>O princípio da integridade assegura que os dados mantenham suas características originais, ou seja, não sejam alterados indevidamente. Existe perda da integridade quando uma informação é modificada ou violada impropriamente. Por exemplo, se um funcionário alterar uma informação para simular um preço mais alto que o real, está corrompendo o princípio da integridade.</p>',
   2,
   'http://sfwallpaper.com/images/blog-wallpaper-3.jpg',
   'Moderation',
   now (),
   'Ryan',
   now ()
);
INSERT INTO tb_post
(
   title,
   summary,
   views,
   body,
   user_id,
   post_image,
   created_by,
   created_date,
   last_modified_by,
   last_modified_date
)
VALUES
(
   'Autencidade e Disponibilidade',
   '"Os limites na autoridade para um usuário acessar informações e o quanto o acesso a esta informação estará disponível"',
   0,
   '<p>O princípio da autenticidade garante que as informações sejam provenientes de uma fonte confiável. Em outras palavras, confirma que os dados possuem legitimidade, não havendo manipulação ou intervenções externas, como terceiros se passando por colaboradores.</p> <p>A autenticidade é o pilar que valida a autorização do usuário para acessar, transmitir e receber informações, como logins, senhas ou até autenticações biométricas. Um sistema autêntico confirma a identidade dos usuários antes de liberar o acesso.</p> <p>Para que um sistema de informação seja útil, é indispensável que seus dados estejam disponíveis quando necessário. Portanto, a disponibilidade é outro dos quatro princípios da segurança da informação, que garante o acesso em tempo integral para usuários finais.</p> <p>Para fazer isso, você precisa garantir a estabilidade e acesso permanente às informações dos sistemas por meio de processos de manutenção rápida, eliminação de falhas de software, atualizações contínuas e planos de gerenciamento de crises.</p> <p>Os sistemas são vulneráveis a desastres naturais, ataques, falta de energia e diversas outras ameaças à disponibilidade. Manter os sistemas seguros também significa garantir o máximo possível de segurança para que os dados estejam sempre disponíveis.</p>',
   3,
   'http://sfwallpaper.com/images/blog-wallpaper-3.jpg',
   'Moderation',
   now (),
   'Francis',
   now ()
);