output "Instance-Public-IP" {
    value = aws_instance.my_VM.public_ip
    description = "Public IP address of EC2 Instance"
}

output "Instance-ID" {
    value = aws_instance.my_VM.id
    description = "Instance-ID"  
}