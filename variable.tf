variable "ami" {
    type = string
    description = "Ubuntu AMI ID in NV region"
    default = "AMI-ID"
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