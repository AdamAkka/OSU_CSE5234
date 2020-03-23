var checkError = new Set();

function checkQuantity(count) {
	var verifyResult = true;
	var quantityRequested = document.getElementById("quantityRequested" + count);
	if (isNaN(quantityRequested.value)) {
		verifyResult = false;
		checkError.add(count);
		alert("The quantity of item " + count + " is not a number, please check the quantity.");
	} else if (!isNaN(quantityRequested.value) && parseInt(quantityRequested.value) < 0) {
		verifyResult = false;
		checkError.add(count);
		alert("The quantity of item " + count + " cannot be less than 0, please check the quantity");
	} else {
		checkError.delete(count);
	}
	return verifyResult;
}

function onSubmitChecking() {
	return checkError.size == 0;
}