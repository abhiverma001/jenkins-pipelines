variable "ami" {
    type = string
    description = "AMI"
    default = "ami-0df435f331839b2d6"
}

variable "instance_type" {
    type = string
    description = "Instance_type"
    default = "t2.micro"
}


variable "name_tag" {
    type = string
    description = "Name of the ec2 instance"
    default = "Test-EC2-Instance"
}
