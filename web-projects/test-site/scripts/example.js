var html = document.querySelector('html');
var list = document.createElement('ul');
html.onclick = function(){
	var listContent = document.createElement('li');
	var txt  = prompt("Enter the new content: ");
	listContent.textContent = txt;
	list.appendChild(listContent);

	listContent.onclick = function(e) {
    e.stopPropagation();
    const listChange = prompt('Enter new content for your list item');
    this.textContent = listChange;
    document.body.appendChild(list);
  }
}