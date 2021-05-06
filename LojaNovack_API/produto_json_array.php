<?php


$con= new mysqli("localhost","root","","lojavirtual");


$st=$con->prepare("select * from produtos");
$st->execute();
$rs=$st->get_result();

$emps=array();

while($row=$rs->fetch_assoc())
{
	array_push($emps, $row);
}

echo json_encode($emps);

?>