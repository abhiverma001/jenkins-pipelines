resource "aws_instance" "my_VM" {
    ami                = var.ami //ubuntu-ami
    instance_type      = var.instance_type

    tags = {
      Name = var.name_tag
    }
}