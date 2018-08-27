
insert into tb_pessoa (ds_nome, fl_ativo) values ('Ricardo Lopes Correa', true);
insert into tb_pessoa (ds_nome, fl_ativo) values ('Mara Sousa', true);
insert into tb_pessoa (ds_nome, fl_ativo) values ('Elisio Ravi', true);

insert into tb_fluxo (id_fluxo, nome, fl_ativo) values (1, 'CONTRATACAO PF', true);
insert into tb_fluxo (id_fluxo, nome, fl_ativo) values (2, 'CONTRATACAO PJ', true);

insert into tb_fase (id_fase,fluxo_id_fluxo, nm_fase, fl_inicial, fl_ativo)
values (1, 1, 'Cadastro da Proposta', true, true);

insert into tb_fase (id_fase, fluxo_id_fluxo, nm_fase, fl_inicial, fl_ativo)
values (2, 1, 'Analise Jurídico', true, true);

insert into tb_fase (id_fase, fluxo_id_fluxo, nm_fase, fl_inicial, fl_ativo)
values (3, 1, 'Analise Mesa Crédito', true, true);