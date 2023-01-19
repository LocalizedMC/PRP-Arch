<center><div align="center">

<img height="150" src="icon/400x400.png" width="150"/>

# PatchouliResourcePatch-Arch

![Enviroment](https://img.shields.io/badge/Enviroment-Client-purple)


A [PatchouliResourcePatch](https://www.curseforge.com/minecraft/mc-mods/prp) unofficial fork. 
Support Forge/Fabric/Quilt.

[ZH-CN](README-zh_cn.md) / EN-US

</div></center>

Since Patchouli changed in 1.14+ to store and load books in /data/, 
external resource packs or data packs cannot overwrite the content of these books.

This mod uses mixin to change Patchouli's loading behavior so that it tries to load from a 
resource pack before loading from data.

Useful only for non-English players or people who want to apply resource packs to Patchouli books.

<a rel="license" href="http://creativecommons.org/licenses/by-nc-sa/4.0/"><img alt="Creative Commons License" style="border-width:0" src="https://i.creativecommons.org/l/by-nc-sa/4.0/88x31.png" /></a><br />This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-sa/4.0/">Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License</a>.