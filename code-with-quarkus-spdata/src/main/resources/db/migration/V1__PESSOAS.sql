create table pessoas
(
    id bigint not null constraint pessoas_pkey primary key   GENERATED BY DEFAULT AS IDENTITY,
    nome varchar(200),
    cpf_cpnj varchar(14),
    agencia bigint,
    conta   bigint
);
