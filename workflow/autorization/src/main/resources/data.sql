
insert into tb_pessoa (ds_nome, fl_ativo) values ('Ricardo Lopes Correa', true);
insert into tb_pessoa (ds_nome, fl_ativo) values ('Mara Sousa', true);
insert into tb_pessoa (ds_nome, fl_ativo) values ('Elisio Ravi', true);

insert into tb_fluxo (id_fluxo, nome, fl_ativo) values (1, 'CONTRATACAO PF', true);
insert into tb_fluxo (id_fluxo, nome, fl_ativo) values (2, 'CONTRATACAO PJ', true);

insert into tb_acao (nm_acao, fl_ativo) values ('Aprovar', true);
insert into tb_acao (nm_acao, fl_ativo) values ('Reprovar', true);
insert into tb_acao (nm_acao, fl_ativo) values ('Enviar Para Reanálise', true);
insert into tb_acao (nm_acao, fl_ativo) values ('Retornar da Reanálise', true);

insert into tb_status (nm_status, fl_ativo) values ('Em Andamento', true);
insert into tb_status (nm_status, fl_ativo) values ('Encerrado', true);

insert into tb_fase (id_fase,fluxo_id_fluxo, nm_fase, fl_inicial, fl_ativo)
values (1, 1, 'Cadastro da Proposta', true, true);

insert into tb_fase (id_fase, fluxo_id_fluxo, nm_fase, fl_inicial, fl_ativo)
values (2, 1, 'Analise Juridico', false, true);

insert into tb_fase (id_fase, fluxo_id_fluxo, nm_fase, fl_inicial, fl_ativo)
values (3, 1, 'Analise Mesa Crédito', false, true);

insert into tb_fase (id_fase, fluxo_id_fluxo, nm_fase, fl_inicial, fl_ativo)
values (4, 1, 'Envio de Documentos', false, true);

insert into tb_fase (id_fase, fluxo_id_fluxo, nm_fase, fl_inicial, fl_ativo)
values (5, 1, 'Assinatura Contrato', false, true);

insert into TB_FASE_ACAO ( id_fase_acao, fase_id_fase,  acao_nm_acao, fase_destino_id_fase, status_nm_status, fl_ativo )
values (1, 1,  'Aprovar', 2, 'Em Andamento', true); 

insert into TB_FASE_ACAO ( id_fase_acao, fase_id_fase,  acao_nm_acao, fase_destino_id_fase, status_nm_status, fl_ativo )
values (2, 1,  'Aprovar', 3, 'Em Andamento', true); 

insert into TB_FASE_ACAO ( id_fase_acao, fase_id_fase,  acao_nm_acao, fase_destino_id_fase, status_nm_status, fl_ativo )
values (3, 3,  'Aprovar', 4, 'Em Andamento', true);

insert into TB_FASE_ACAO ( id_fase_acao, fase_id_fase,  acao_nm_acao, fase_destino_id_fase, status_nm_status, fl_ativo )
values (4, 4,  'Aprovar', 5, 'Encerrado', true);





