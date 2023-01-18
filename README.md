<center><div align="center">

<img height="150" src="icon/icon-arch.png" width="150"/>

# PatchouliResourcePatch-Arch

![Enviroment](https://img.shields.io/badge/Enviroment-Client-purple)


Support Forge/Fabric/Quilt.

</div></center>

Since Patchouli changed to store books in /data/, external resource packs or data packs can't override those books' contents.

This mod use mixin to change Patchouli's loading behavior, making it try to load from assets before loading from data.

About patchouli 1.18.x: some mods (like Apothesis) still put their manual in the legacy data folder, and patchouli under this circumstance won't even try to load from resource pack, so this patch is needed.

Only useful to non-English players or who want to apply resource pack to Patchouli books.
