create table limitediario
(
    id bigint not null constraint limitediario_pkey primary key GENERATED BY DEFAULT AS IDENTITY,
    agencia bigint,
    conta   bigint,
    data    date,
    valor   numeric(19, 2)
);




