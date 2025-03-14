<?php
session_start();

if(isset($_POST['registerbtn'])){
    $name = $_POST['name'];
    $roll = $_POST['roll'];
    $class = $_POST['clss'];
    $email = $_POST['email'];
    $password = $_POST['psw'];


    $con = mysqli_connect('localhost','root','root','assignment5');
    $sql = "INSERT INTO `student` VALUES ('$name','$roll','$class','$email','$password')";
    $result = mysqli_query($con,$sql);

    if($result){
        echo "Data inserted successfully";
    }
    else{
        echo "Data not inserted";
        die(mysqli_error($con));
    }

}
?>