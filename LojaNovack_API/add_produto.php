<?php


$con= new mysqli("localhost","root","","lojavirtual");


$st=$con->prepare("insert into produtos values(?,?,?,?,?)");
$st->bind_param("isssid", $_GET["id"],$_GET["nome"],$_GET["descricao"],$_GET["estoque"],$_GET["preco"]);
$st->execute();




/* localhost/LojaVirtual/add_produto.php?id=1&nome=KitMaternidadeMasculino&descricao=blablabla&estoque=1&preco=190.00 */ 



?>