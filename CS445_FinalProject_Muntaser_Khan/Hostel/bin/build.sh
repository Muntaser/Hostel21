#!/bin/bash

# --------------------------------------------------------------------------------------------------------
# CS445 Muntaser Khan
#
#		This script is to compile Hostel Project

#			Run the command below to start command line interface, it deletes previous bins and compile them again
#				java h21 <command options>
# --------------------------------------------------------------------------------------------------------



echo "Deleting existing bins..."
if [ -f ./Availability.class ] ;
then 
	rm -f ./Availability.class 
fi
if [ -f ./AvailabilityImpl.class ] ;
then 
	rm -f ./AvailabilityImpl.class 
fi
if [ -f ./AvailabilityModel.class ] ;
then 
	rm -f ./AvailabilityModel.class 
fi
if [ -f ./AvailabilityQueryModel.class ] ;
then 
	rm -f ./AvailabilityQueryModel.class 
fi
if [ -f ./Search.class ] ;
then 
	rm -f ./Search.class 
fi
if [ -f ./SearchImpl.class ] ;
then 
	rm -f ./SearchImpl.class 
fi
if [ -f ./SearchModel.class ] ;
then 
	rm -f ./SearchModel.class 
fi
if [ -f ./SearchQueryModel.class ] ;
then 
	rm -f ./SearchQueryModel.class 
fi
if [ -f ./HostelDM.class ] ;
then 
	rm -f ./HostelDM.class 
fi
if [ -f ./HostelDMSerImpl.class ] ;
then 
	rm -f ./HostelDMSerImpl.class 
fi
if [ -f ./HostelModel.class ] ;
then 
	rm -f ./HostelModel.class 
fi
if [ -f ./HostelQueryModel.class ] ;
then 
	rm -f ./HostelQueryModel.class 
fi
if [ -f ./loadFile.class ] ;
then 
	rm -f ./loadFile.class 
fi
if [ -f ./ReadWriteFile.class ] ;
then 
	rm -f ./ReadWriteFile.class 
fi
if [ -f ./UidDM.class ] ;
then 
	rm -f ./UidDM.class 
fi
if [ -f ./UidDMFactory.class ] ;
then 
	rm -f ./UidDMFactory.class 
fi
if [ -f ./UidDMSerImpl.class ] ;
then 
	rm -f ./UidDMSerImpl.class 
fi
if [ -f ./UidModel.class ] ;
then 
	rm -f ./UidModelEnum.class 
fi
if [ -f ./h21.class ] ;
then 
	rm -f ./h21.class 
fi

echo

echo
echo "Compiling the code for command line interface..."

javac h21.java
echo
read -p "Do you want to find usage of command line interface? [Y/N] " response
case $response in
y|Y) 
echo
java h21
;;
n|N)
;;
esac




