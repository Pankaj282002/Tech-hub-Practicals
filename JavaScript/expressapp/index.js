let express=require("express");
let path=require("path");
let pubPath=path.join(__dirname,"public");
let app=express();
app.use(express.static(pubPath));

app.get("", (req,res)=>{
    res.send("new Home page started.....");
});
app.get("/reg",(req,res)=>{
    res.sendFile(pubPath+"/register.html");
});
app.listen(5000,()=>{
    console.log("Server started sucsessfuly....");
})