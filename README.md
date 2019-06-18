# Caesar Cipher
* This program was created using Java language.
#### Author
* Victor Muchui.
### Description
* This program uses a command line interface to encrypt your name along with other words that you may wish to encrypt using a key that only you know.

## Prerequisites & setup
#### Prerequisites
* Git.
* Java
* Text Editor of your choice.
* Gradle
#### Set up
* first clone the repo into your machine by running `git clone https://github.com/vmuchui/caesarcipher2` on your terminal.
* run the command `gradle build`
* navigate into the build\classes/java/main/ directory created using the command `cd build\classes/java/main/`.
* run the command `java App`.
## BDD
|example|input| output
|----|----|------
|encrypt => word: 'muchui', key: 1|String=>word, Integer=>key|String:'nvdivj'
|decrypt => word: 'nvdivj', key: 1|String=>word, Integer=>key|String:'muchui'
### How to use
* Type number '1' to encrypt.
* Enter the word you would like to encrypt.
* Enter a number to use as the key for the encryption.
* Type number '2' to decrypt.
* Type the word to be decrypted.
* Enter the number to be used as the key for decryption.
* To exit type number '3'.
* Confirm whether you would like to exit the application by typing either '1' for yes and '2' for no.
#### Known Bugs
* In case of of any bugs found please contact using the information below.
#### Contact Information
* email - kaigongimuchui@gmail.com
* call - +254 717304712
## Copyright and license.
* (c) 2019 Muchui Victor Moringa School.
* MIT License.